/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Metrics associated with object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-01T17:07:39.251663+02:00[Europe/Warsaw]")
public class TradeMetricsDto {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_TRADES = "trades";
  @SerializedName(SERIALIZED_NAME_TRADES)
  private Long trades;

  public static final String SERIALIZED_NAME_VWAP = "vwap";
  @SerializedName(SERIALIZED_NAME_VWAP)
  private String vwap;

  public TradeMetricsDto() {
  }

  public TradeMetricsDto price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nonnull
  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public TradeMetricsDto volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @javax.annotation.Nonnull
  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  public TradeMetricsDto trades(Long trades) {
    
    this.trades = trades;
    return this;
  }

   /**
   * Total amount of executed trades
   * @return trades
  **/
  @javax.annotation.Nonnull
  public Long getTrades() {
    return trades;
  }


  public void setTrades(Long trades) {
    this.trades = trades;
  }


  public TradeMetricsDto vwap(String vwap) {
    
    this.vwap = vwap;
    return this;
  }

   /**
   * Get vwap
   * @return vwap
  **/
  @javax.annotation.Nonnull
  public String getVwap() {
    return vwap;
  }


  public void setVwap(String vwap) {
    this.vwap = vwap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeMetricsDto tradeMetricsDto = (TradeMetricsDto) o;
    return Objects.equals(this.price, tradeMetricsDto.price) &&
        Objects.equals(this.volume, tradeMetricsDto.volume) &&
        Objects.equals(this.trades, tradeMetricsDto.trades) &&
        Objects.equals(this.vwap, tradeMetricsDto.vwap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, volume, trades, vwap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeMetricsDto {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
    sb.append("    vwap: ").append(toIndentedString(vwap)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("price");
    openapiFields.add("volume");
    openapiFields.add("trades");
    openapiFields.add("vwap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("volume");
    openapiRequiredFields.add("trades");
    openapiRequiredFields.add("vwap");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TradeMetricsDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TradeMetricsDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TradeMetricsDto is not found in the empty JSON string", TradeMetricsDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TradeMetricsDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TradeMetricsDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TradeMetricsDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (!jsonObj.get("volume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume").toString()));
      }
      if (!jsonObj.get("vwap").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vwap` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vwap").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TradeMetricsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TradeMetricsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TradeMetricsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TradeMetricsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<TradeMetricsDto>() {
           @Override
           public void write(JsonWriter out, TradeMetricsDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TradeMetricsDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TradeMetricsDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TradeMetricsDto
  * @throws IOException if the JSON string is invalid with respect to TradeMetricsDto
  */
  public static TradeMetricsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TradeMetricsDto.class);
  }

 /**
  * Convert an instance of TradeMetricsDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

