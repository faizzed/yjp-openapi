/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v4/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanNetworkは、予測対象を表します。&lt;br&gt; デフォルト値はYAHOO_SEARCHです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanNetwork describes the forecast target.&lt;br&gt; Default value will be \&quot;YAHOO_SEARCH\&quot;.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;YAHOO_SEARCH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;検索のみです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Search only.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SEARCH_NETWORK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;検索を含むすべての広告掲載方式です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;All ad distribution, including search.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
@JsonAdapter(KeywordForecastMetricsServiceKeywordPlanNetwork.Adapter.class)
public enum KeywordForecastMetricsServiceKeywordPlanNetwork {
  
  YAHOO_SEARCH("YAHOO_SEARCH"),
  
  SEARCH_NETWORK("SEARCH_NETWORK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  KeywordForecastMetricsServiceKeywordPlanNetwork(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordForecastMetricsServiceKeywordPlanNetwork fromValue(String value) {
    for (KeywordForecastMetricsServiceKeywordPlanNetwork b : KeywordForecastMetricsServiceKeywordPlanNetwork.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<KeywordForecastMetricsServiceKeywordPlanNetwork> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordForecastMetricsServiceKeywordPlanNetwork enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordForecastMetricsServiceKeywordPlanNetwork read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordForecastMetricsServiceKeywordPlanNetwork.fromValue(value);
    }
  }
}
