

# PairDto

Pair is a combination of base and quote currencies; the value of one currency being quoted against the other

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier |  |
|**assetType** | **String** | The type of asset. Spot, future, and option are the main asset types we are covering with financial data. Futures and options are derivatives |  |
|**symbol** | **String** | The first listed currency of a currency pair, they are usually cryptocurrency tokens. The most diverse parameter |  |
|**base** | **String** | The second listed currency in the pair, also known as quote currency or counter currency. Usually fiat, stablecoin, or more popular crypto like BTC and ETH. The less diverse parameter |  |
|**futureDeliveryDate** | **String** | The last day that a future contract is valid |  [optional] |
|**optionType** | **String** | Refers to the holder’s right to sell/buy a number of assets within a specific period of time at a certain price. This takes two values:put for sell and call for buy |  [optional] |
|**optionExpiration** | **String** | The options’ lifespan. This takes two values:eu (may be exercised only at the expiration date) and am (may be exercised at any time before the expiration date) |  [optional] |
|**optionStrike** | **String** | The price at which option contract can be exercised |  [optional] |
|**optionDeliveryDate** | **String** | The last day that an option is valid |  [optional] |



