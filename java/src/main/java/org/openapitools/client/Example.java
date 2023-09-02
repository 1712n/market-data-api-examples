package org.openapitools.client;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
      List<String> markets = new ArrayList<>();
      while (hasNext) {
        PageWrapperTradeMarketDto pageWrapperTradeMarketDto =
            tradesApi.tradeMarkets(true, null, null, "spot", "binance", null, true, page, size);
        pageWrapperTradeMarketDto.getContent().stream()
            .filter(
                tradeMarketDto ->
                    Optional.ofNullable(tradeMarketDto.getMetrics())
                        .flatMap(map -> Optional.ofNullable(map.get("1h")))
                        .filter(metrics -> metrics.getTrades() >= 3)
                        .isPresent())
            .forEach(tradeMarketDto -> markets.add(tradeMarketDto.getMarket().getId()));
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
