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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemを除外設定する種別です。&lt;br&gt; このフィールドは、ADD時に必須となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Type to set PageFeedItem.&lt;br&gt; This field is required in ADD operation, and will be ignored in REMOVE operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;URL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;URL&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;URLs&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PAGE_TITLE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;Webページのタイトル&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Title of web pages&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PAGE_CONTENT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;Webページのコンテンツ&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Contents of web pages&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOM_LABEL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カスタムラベル&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Custom labels&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ALL_PAGES&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;すべてのWebページ&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;All web pages&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
@JsonAdapter(CampaignWebpageServiceWebpageConditionType.Adapter.class)
public enum CampaignWebpageServiceWebpageConditionType {
  
  URL("URL"),
  
  PAGE_TITLE("PAGE_TITLE"),
  
  PAGE_CONTENT("PAGE_CONTENT"),
  
  CUSTOM_LABEL("CUSTOM_LABEL"),
  
  ALL_PAGES("ALL_PAGES"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignWebpageServiceWebpageConditionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignWebpageServiceWebpageConditionType fromValue(String value) {
    for (CampaignWebpageServiceWebpageConditionType b : CampaignWebpageServiceWebpageConditionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CampaignWebpageServiceWebpageConditionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignWebpageServiceWebpageConditionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignWebpageServiceWebpageConditionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignWebpageServiceWebpageConditionType.fromValue(value);
    }
  }
}

