# DataDictionariesOrderBooksApi

All URIs are relative to *https://api.financial.inca.digital*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderBookAssets**](DataDictionariesOrderBooksApi.md#orderBookAssets) | **GET** /dictionaries/v2/order-books/assets | Get assets |
| [**orderBookMarketVenues**](DataDictionariesOrderBooksApi.md#orderBookMarketVenues) | **GET** /dictionaries/v2/order-books/market-venues | Get market-venues |
| [**orderBookMarkets**](DataDictionariesOrderBooksApi.md#orderBookMarkets) | **GET** /dictionaries/v2/order-books/markets | Get markets |
| [**orderBookPairs**](DataDictionariesOrderBooksApi.md#orderBookPairs) | **GET** /dictionaries/v2/order-books/pairs | Get pairs |


<a id="orderBookAssets"></a>
# **orderBookAssets**
> PageWrapperAssetDto orderBookAssets(page, size)

Get assets

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataDictionariesOrderBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.financial.inca.digital");

    DataDictionariesOrderBooksApi apiInstance = new DataDictionariesOrderBooksApi(defaultClient);
    Integer page = 0; // Integer | Page number of items to start with (0..N)
    Integer size = 1000; // Integer | Number of elements to return per page
    try {
      PageWrapperAssetDto result = apiInstance.orderBookAssets(page, size);
      System.out.println(result);
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

<a id="orderBookMarketVenues"></a>
# **orderBookMarketVenues**
> PageWrapperMarketVenueDto orderBookMarketVenues(active, page, size)

Get market-venues

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataDictionariesOrderBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.financial.inca.digital");

    DataDictionariesOrderBooksApi apiInstance = new DataDictionariesOrderBooksApi(defaultClient);
    Boolean active = true; // Boolean | Activity status filter. The market venue is considered inactive if we stop receiving messages for it. In case we receive a message from an inactive market venue, we flag it as active again.
    Integer page = 0; // Integer | Page number of items to start with (0..N)
    Integer size = 1000; // Integer | Number of elements to return per page
    try {
      PageWrapperMarketVenueDto result = apiInstance.orderBookMarketVenues(active, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDictionariesOrderBooksApi#orderBookMarketVenues");
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
| **active** | **Boolean**| Activity status filter. The market venue is considered inactive if we stop receiving messages for it. In case we receive a message from an inactive market venue, we flag it as active again. | [optional] |
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

<a id="orderBookMarkets"></a>
# **orderBookMarkets**
> PageWrapperObMarketDto orderBookMarkets(active, symbol, base, assetType, marketVenue, pairId, verbose, page, size)

Get markets

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataDictionariesOrderBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.financial.inca.digital");

    DataDictionariesOrderBooksApi apiInstance = new DataDictionariesOrderBooksApi(defaultClient);
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
      PageWrapperObMarketDto result = apiInstance.orderBookMarkets(active, symbol, base, assetType, marketVenue, pairId, verbose, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDictionariesOrderBooksApi#orderBookMarkets");
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

[**PageWrapperObMarketDto**](PageWrapperObMarketDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="orderBookPairs"></a>
# **orderBookPairs**
> PageWrapperObPairDto orderBookPairs(active, symbol, base, assetType, page, size)

Get pairs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataDictionariesOrderBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.financial.inca.digital");

    DataDictionariesOrderBooksApi apiInstance = new DataDictionariesOrderBooksApi(defaultClient);
    Boolean active = true; // Boolean | Activity status filter. The pair is considered inactive if we stop receiving messages for it. In case we receive a message from an inactive pair, we flag it as active again.
    String symbol = "symbol_example"; // String | Asset symbol filter. The first listed currency of a currency pair, they are usually cryptocurrency tokens. The most diverse parameter
    String base = "base_example"; // String | Asset base filter. The second listed currency in the pair, also known as quote currency or counter currency. Usually fiat, stablecoin, or more popular crypto like BTC and ETH. The less diverse parameter
    String assetType = "assetType_example"; // String | Filter by type of the asset. Possible values are: 'spot', 'future' or 'option'
    Integer page = 0; // Integer | Page number of items to start with (0..N)
    Integer size = 1000; // Integer | Number of elements to return per page
    try {
      PageWrapperObPairDto result = apiInstance.orderBookPairs(active, symbol, base, assetType, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDictionariesOrderBooksApi#orderBookPairs");
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

[**PageWrapperObPairDto**](PageWrapperObPairDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

