# DataDictionariesTradesApi

All URIs are relative to *https://api.financial.inca.digital*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tradeAssets**](DataDictionariesTradesApi.md#tradeAssets) | **GET** /dictionaries/v2/trades/assets | Get assets |
| [**tradeMarketVenues**](DataDictionariesTradesApi.md#tradeMarketVenues) | **GET** /dictionaries/v2/trades/market-venues | Get market-venues |
| [**tradeMarkets**](DataDictionariesTradesApi.md#tradeMarkets) | **GET** /dictionaries/v2/trades/markets | Get markets |
| [**tradePairs**](DataDictionariesTradesApi.md#tradePairs) | **GET** /dictionaries/v2/trades/pairs | Get pairs |


<a id="tradeAssets"></a>
# **tradeAssets**
> PageWrapperAssetDto tradeAssets(page, size)

Get assets

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataDictionariesTradesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.financial.inca.digital");

    DataDictionariesTradesApi apiInstance = new DataDictionariesTradesApi(defaultClient);
    Integer page = 0; // Integer | Page number of items to start with (0..N)
    Integer size = 1000; // Integer | Number of elements to return per page
    try {
      PageWrapperAssetDto result = apiInstance.tradeAssets(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDictionariesTradesApi#tradeAssets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Page number of items to start with (0..N) | [optional] [default to 0] |
| **size** | **Integer**| Number of elements to return per page | [optional] [default to 1000] |

### Return type

[**PageWrapperAssetDto**](PageWrapperAssetDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="tradeMarketVenues"></a>
# **tradeMarketVenues**
> PageWrapperMarketVenueDto tradeMarketVenues(active, page, size)

Get market-venues

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataDictionariesTradesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.financial.inca.digital");

    DataDictionariesTradesApi apiInstance = new DataDictionariesTradesApi(defaultClient);
    Boolean active = true; // Boolean | Activity status filter. The market is considered inactive if we stop receiving messages for it. In case we receive a message from an inactive market, we flag it as active again.
    Integer page = 0; // Integer | Page number of items to start with (0..N)
    Integer size = 1000; // Integer | Number of elements to return per page
    try {
      PageWrapperMarketVenueDto result = apiInstance.tradeMarketVenues(active, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDictionariesTradesApi#tradeMarketVenues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **active** | **Boolean**| Activity status filter. The market is considered inactive if we stop receiving messages for it. In case we receive a message from an inactive market, we flag it as active again. | [optional] |
| **page** | **Integer**| Page number of items to start with (0..N) | [optional] [default to 0] |
| **size** | **Integer**| Number of elements to return per page | [optional] [default to 1000] |

### Return type

[**PageWrapperMarketVenueDto**](PageWrapperMarketVenueDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="tradeMarkets"></a>
# **tradeMarkets**
> PageWrapperTradeMarketDto tradeMarkets(active, symbol, base, assetType, marketVenue, pairId, verbose, page, size)

Get markets

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataDictionariesTradesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.financial.inca.digital");

    DataDictionariesTradesApi apiInstance = new DataDictionariesTradesApi(defaultClient);
    Boolean active = true; // Boolean | Activity status filter. The market is considered inactive if we stop receiving messages for it. In case we receive a message from an inactive market, we flag it as active again.
    String symbol = "symbol_example"; // String | Asset symbol filter. The first listed currency of a currency pair, they are usually cryptocurrency tokens. The most diverse parameter
    String base = "base_example"; // String | Asset base filter. The second listed currency in the pair, also known as quote currency or counter currency. Usually fiat, stablecoin, or more popular crypto like BTC and ETH. The less diverse parameter
    String assetType = "assetType_example"; // String | Filter by type of the asset. Possible values are: 'spot', 'future' or 'option'
    String marketVenue = "marketVenue_example"; // String | Filter by market venue
    String pairId = "pairId_example"; // String | Filter by pair unique identifier
    Boolean verbose = false; // Boolean | Weather include pair details to response
    Integer page = 0; // Integer | Page number of items to start with (0..N)
    Integer size = 1000; // Integer | Number of elements to return per page
    try {
      PageWrapperTradeMarketDto result = apiInstance.tradeMarkets(active, symbol, base, assetType, marketVenue, pairId, verbose, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDictionariesTradesApi#tradeMarkets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **active** | **Boolean**| Activity status filter. The market is considered inactive if we stop receiving messages for it. In case we receive a message from an inactive market, we flag it as active again. | [optional] |
| **symbol** | **String**| Asset symbol filter. The first listed currency of a currency pair, they are usually cryptocurrency tokens. The most diverse parameter | [optional] |
| **base** | **String**| Asset base filter. The second listed currency in the pair, also known as quote currency or counter currency. Usually fiat, stablecoin, or more popular crypto like BTC and ETH. The less diverse parameter | [optional] |
| **assetType** | **String**| Filter by type of the asset. Possible values are: &#39;spot&#39;, &#39;future&#39; or &#39;option&#39; | [optional] |
| **marketVenue** | **String**| Filter by market venue | [optional] |
| **pairId** | **String**| Filter by pair unique identifier | [optional] |
| **verbose** | **Boolean**| Weather include pair details to response | [optional] [default to false] |
| **page** | **Integer**| Page number of items to start with (0..N) | [optional] [default to 0] |
| **size** | **Integer**| Number of elements to return per page | [optional] [default to 1000] |

### Return type

[**PageWrapperTradeMarketDto**](PageWrapperTradeMarketDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="tradePairs"></a>
# **tradePairs**
> PageWrapperTradePairDto tradePairs(active, symbol, base, assetType, page, size)

Get pairs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataDictionariesTradesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.financial.inca.digital");

    DataDictionariesTradesApi apiInstance = new DataDictionariesTradesApi(defaultClient);
    Boolean active = true; // Boolean | Activity status filter. The pair is considered inactive if we stop receiving messages for it. In case we receive a message from an inactive pair, we flag it as active again.
    String symbol = "symbol_example"; // String | Asset symbol filter. The first listed currency of a currency pair, they are usually cryptocurrency tokens. The most diverse parameter
    String base = "base_example"; // String | Asset base filter. The second listed currency in the pair, also known as quote currency or counter currency. Usually fiat, stablecoin, or more popular crypto like BTC and ETH. The less diverse parameter
    String assetType = "assetType_example"; // String | Filter by type of the asset. Possible values are: 'spot', 'future' or 'option'
    Integer page = 0; // Integer | Page number of items to start with (0..N)
    Integer size = 1000; // Integer | Number of elements to return per page
    try {
      PageWrapperTradePairDto result = apiInstance.tradePairs(active, symbol, base, assetType, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDictionariesTradesApi#tradePairs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **active** | **Boolean**| Activity status filter. The pair is considered inactive if we stop receiving messages for it. In case we receive a message from an inactive pair, we flag it as active again. | [optional] |
| **symbol** | **String**| Asset symbol filter. The first listed currency of a currency pair, they are usually cryptocurrency tokens. The most diverse parameter | [optional] |
| **base** | **String**| Asset base filter. The second listed currency in the pair, also known as quote currency or counter currency. Usually fiat, stablecoin, or more popular crypto like BTC and ETH. The less diverse parameter | [optional] |
| **assetType** | **String**| Filter by type of the asset. Possible values are: &#39;spot&#39;, &#39;future&#39; or &#39;option&#39; | [optional] |
| **page** | **Integer**| Page number of items to start with (0..N) | [optional] [default to 0] |
| **size** | **Integer**| Number of elements to return per page | [optional] [default to 1000] |

### Return type

[**PageWrapperTradePairDto**](PageWrapperTradePairDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

