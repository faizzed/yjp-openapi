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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountLinkServiceLinkAccessPermissionは、アカウントリンクアクセス権限を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountLinkServiceLinkAccessPermission displays the account link access permission.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ALL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;全ての操作を許可します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Allows all operations.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;READ_ONLY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;参照のみ許可します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Only references are allowed.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
@JsonAdapter(AccountLinkServiceLinkAccessPermission.Adapter.class)
public enum AccountLinkServiceLinkAccessPermission {
  
  ALL("ALL"),
  
  READ_ONLY("READ_ONLY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountLinkServiceLinkAccessPermission(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountLinkServiceLinkAccessPermission fromValue(String value) {
    for (AccountLinkServiceLinkAccessPermission b : AccountLinkServiceLinkAccessPermission.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountLinkServiceLinkAccessPermission> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountLinkServiceLinkAccessPermission enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountLinkServiceLinkAccessPermission read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountLinkServiceLinkAccessPermission.fromValue(value);
    }
  }
}
