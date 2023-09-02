package org.openapitools.client;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;

import org.openapitools.client.api.DataDictionariesOrderBooksApi;
import org.openapitools.client.api.DataDictionariesTradesApi;
import org.openapitools.client.model.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.financial.inca.digital");

    DataDictionariesOrderBooksApi orderBooksApi = new DataDictionariesOrderBooksApi(defaultClient);
    DataDictionariesTradesApi tradesApi = new DataDictionariesTradesApi(defaultClient);
    try {
      int size = 100;
      int page = 0;
      boolean hasNext = true;
      TreeMap<BigDecimal, List<String>> sortedMap = new TreeMap<>();
      while (hasNext) {
        PageWrapperTradeMarketDto pageWrapperTradeMarketDto =
            tradesApi.tradeMarkets(true, "btc", "usd", "spot", null, null, true, page, size);
        pageWrapperTradeMarketDto
            .getContent()
            .forEach(
                tradeMarketDto -> {
                  BigDecimal vwap =
                      Optional.ofNullable(tradeMarketDto.getMetrics())
                          .flatMap(
                              map ->
                                  Optional.ofNullable(map.get("1h")).map(TradeMetricsDto::getVwap))
                          .map(BigDecimal::new)
                          .orElse(BigDecimal.valueOf(Integer.MIN_VALUE));
                  sortedMap.compute(
                      vwap,
                      (key, value) -> {
                        List<String> marketVenues = value == null ? new ArrayList<>() : value;
                        marketVenues.add(tradeMarketDto.getMarket().getMarketVenue());
                        return marketVenues;
                      });
                });
        hasNext = pageWrapperTradeMarketDto.getHasNext();
        page++;
      }
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDictionariesOrderBooksApi#orderBookAssets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
