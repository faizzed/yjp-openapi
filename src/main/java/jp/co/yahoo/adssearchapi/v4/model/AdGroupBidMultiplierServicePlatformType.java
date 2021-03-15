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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupBidMultiplierServicePlatformTypeは、広告を配信するデバイスの種類です。&lt;br&gt; SETおよびREMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupBidMultiplierServicePlatformType is a platform of the selected device.&lt;br&gt; This field is required in SET and REMOVE operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SMART_PHONE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;スマートフォンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Smartphone.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TABLET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;タブレットです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Tablet.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DESKTOP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;パソコンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;PC.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
@JsonAdapter(AdGroupBidMultiplierServicePlatformType.Adapter.class)
public enum AdGroupBidMultiplierServicePlatformType {
  
  SMART_PHONE("SMART_PHONE"),
  
  TABLET("TABLET"),
  
  DESKTOP("DESKTOP"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupBidMultiplierServicePlatformType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGroupBidMultiplierServicePlatformType fromValue(String value) {
    for (AdGroupBidMultiplierServicePlatformType b : AdGroupBidMultiplierServicePlatformType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdGroupBidMultiplierServicePlatformType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGroupBidMultiplierServicePlatformType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGroupBidMultiplierServicePlatformType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGroupBidMultiplierServicePlatformType.fromValue(value);
    }
  }
}

