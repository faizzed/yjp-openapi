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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceBiddingStrategyTypeは、自動入札タイプを表します。&lt;br&gt; ADD時、標準入札設定の場合、このフィールドは必須となり、ポートフォリオ入札設定の場合、省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceBiddingStrategyType displays the Auto Bidding type.&lt;br&gt; This field is required when Standard bidding is setting, and is optional when Portfolio bidding is setting in ADD operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MANUAL_CPC&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;手動で入札を行います。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Manual CPC settings&lt;br&gt;* Available in campaign level. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TARGET_ROAS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告費用対効果の目標値です。&lt;br&gt;※キャンペーンの更新時のみ適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Target ROAS.&lt;br&gt;* Available on updating campaign process. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TARGET_SPEND&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;クリック数を最大化します。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Maximize Clicks.&lt;br&gt;* Applicable for campaign. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TARGET_CPA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン単価の目標値です。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Target conversion spend (CPA).&lt;br&gt;* Applicable for campaign. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CONVERSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン数を最大化します。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Maximize Conversions.&lt;br&gt;* Applicable for campaign. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TARGET_IMPRESSION_SHARE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;インプレッションシェアの目標値です。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Target value of impression share.&lt;br&gt;* Applicable for campaign. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
@JsonAdapter(CampaignServiceBiddingStrategyType.Adapter.class)
public enum CampaignServiceBiddingStrategyType {
  
  MANUAL_CPC("MANUAL_CPC"),
  
  TARGET_ROAS("TARGET_ROAS"),
  
  TARGET_SPEND("TARGET_SPEND"),
  
  TARGET_CPA("TARGET_CPA"),
  
  MAXIMIZE_CONVERSIONS("MAXIMIZE_CONVERSIONS"),
  
  TARGET_IMPRESSION_SHARE("TARGET_IMPRESSION_SHARE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceBiddingStrategyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignServiceBiddingStrategyType fromValue(String value) {
    for (CampaignServiceBiddingStrategyType b : CampaignServiceBiddingStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CampaignServiceBiddingStrategyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignServiceBiddingStrategyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignServiceBiddingStrategyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignServiceBiddingStrategyType.fromValue(value);
    }
  }
}

