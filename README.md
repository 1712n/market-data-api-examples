# market-data-api-examples
Examples for Inca Digital Market Data API usage.

For client generation you can use https://github.com/OpenAPITools/openapi-generator

You can find swagger json here: https://api.financial.inca.digital/dictionaries/v2/api-docs

Example of generation with CLI client:
```shell
openapi-generator generate -i https://api.financial.inca.digital/dictionaries/v2/api-docs -g java -o ./java
```

Examples are demonstrated using Java with the template:
```java
public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.financial.inca.digital");

        DataDictionariesOrderBooksApi orderBooksApi = new DataDictionariesOrderBooksApi(defaultClient);
        DataDictionariesTradesApi tradesApi = new DataDictionariesTradesApi(defaultClient);
        try {
            // Example code
        } catch (ApiException e) {
            System.err.println("Exception when calling DataDictionariesOrderBooksApi#orderBookAssets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

1. Get all active pairs, with pagination.
```java
int size = 10;
int page = 0;
boolean hasNext = true;
while (hasNext) {
    PageWrapperTradePairDto pageWrapperTradePairDto = tradesApi.tradePairs(true, null, null, null, page, size);
    hasNext = pageWrapperTradePairDto.getHasNext();
    page++;
}
```
2. Find all the active markets trading BTC on Binance
```java
PageWrapperTradeMarketDto pageWrapperTradeMarketDto = tradesApi.tradeMarkets(true, "btc", null, null, "binance", null, true, page, size);
```
3. Find all the pairs with BTC as symbol
```java
PageWrapperTradePairDto pageWrapperTradePairDto = tradesApi.tradePairs(null, "btc", null, "spot", 0, 10);
```
4. Find spot markets on binance with updates in last 30 days
```java
int size = 100;
int page = 0;
boolean hasNext = true;
Instant thirtyDaysBefore = Instant.now().minus(30, ChronoUnit.DAYS);
List<String> markets = new ArrayList<>();
while (hasNext) {
    PageWrapperTradeMarketDto pageWrapperTradeMarketDto =
        tradesApi.tradeMarkets(true, null, null, "spot", "binance", null, true, page, size);
    pageWrapperTradeMarketDto.getContent().stream()
        .filter(tradeMarketDto -> {
            Instant marketLastSeen = Instant.parse(tradeMarketDto.getLastSeen());
            return marketLastSeen.isAfter(thirtyDaysBefore);
        })
        .forEach(tradeMarketDto -> markets.add(tradeMarketDto.getMarket().getId()));
    hasNext = pageWrapperTradeMarketDto.getHasNext();
    page++;
}
```
5. Find spot markets on binance with >= 3 trades in an hour metrics
```java
int size = 100;
int page = 0;
boolean hasNext = true;
List<String> markets = new ArrayList<>();
while (hasNext) {
    PageWrapperTradeMarketDto pageWrapperTradeMarketDto =
        tradesApi.tradeMarkets(true, null, null, "spot", "binance", null, true, page, size);
    pageWrapperTradeMarketDto.getContent().stream()
        .filter(tradeMarketDto ->
                Optional.ofNullable(tradeMarketDto.getMetrics())
                    .flatMap(map -> Optional.ofNullable(map.get("1h")))
                    .filter(metrics -> metrics.getTrades() >= 3)
                    .isPresent())
        .forEach(tradeMarketDto -> markets.add(tradeMarketDto.getMarket().getId()));
    hasNext = pageWrapperTradeMarketDto.getHasNext();
    page++;
}
```
6. Find all market venues where btc-usd pair traded, sort them by vwap
```java
int size = 100;
int page = 0;
boolean hasNext = true;
TreeMap<BigDecimal, List<String>> sortedMap = new TreeMap<>();
while (hasNext) {
    PageWrapperTradeMarketDto pageWrapperTradeMarketDto =
        tradesApi.tradeMarkets(true, "btc", "usd", "spot", null, null, true, page, size);
    pageWrapperTradeMarketDto
        .getContent()
        .forEach(tradeMarketDto -> {
            BigDecimal vwap = Optional.ofNullable(tradeMarketDto.getMetrics())
                .flatMap(map ->
                    Optional.ofNullable(map.get("1h")).map(TradeMetricsDto::getVwap))
                        .map(BigDecimal::new)
                        .orElse(BigDecimal.valueOf(Integer.MIN_VALUE));
            sortedMap.compute(vwap, (key, value) -> {
                List<String> marketVenues = value == null ? new ArrayList<>() : value;
                marketVenues.add(tradeMarketDto.getMarket().getMarketVenue());
                return marketVenues;
            });
        });
    hasNext = pageWrapperTradeMarketDto.getHasNext();
    page++;
}
```

