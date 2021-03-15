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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceConversionTrackerTypeは、コンバージョンの種別を表します。&lt;br&gt; このフィールドはADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceConversionTrackerType describes conversion type.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WEB_CONVERSION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ウェブページのコンバージョンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Web page conversion&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APP_CONVERSION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリのコンバージョンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;App conversion&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
@JsonAdapter(ConversionTrackerServiceConversionTrackerType.Adapter.class)
public enum ConversionTrackerServiceConversionTrackerType {
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  APP_CONVERSION("APP_CONVERSION"),
  
  APP_LINK_CONVERSION("APP_LINK_CONVERSION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceConversionTrackerType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionTrackerServiceConversionTrackerType fromValue(String value) {
    for (ConversionTrackerServiceConversionTrackerType b : ConversionTrackerServiceConversionTrackerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConversionTrackerServiceConversionTrackerType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConversionTrackerServiceConversionTrackerType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConversionTrackerServiceConversionTrackerType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConversionTrackerServiceConversionTrackerType.fromValue(value);
    }
  }
}

