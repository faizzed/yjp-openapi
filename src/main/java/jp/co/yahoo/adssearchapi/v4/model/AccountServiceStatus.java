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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountServiceStatusは、アカウントの契約状況を表します。&lt;br&gt; MCCアカウントの場合、このフィールドは&lt;code&gt;SERVING&lt;/code&gt;になります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account status.&lt;br&gt; If isManagerAccount is \&quot;TRUE\&quot;, this field will be &lt;code&gt;SERVING&lt;/code&gt;.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INPROGRESS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;登録待ち&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Under registration process&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WAIT_DECIDE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;確定待ち&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Waiting confirmation&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SUSPENDED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;サービス停止中&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The account service is not active.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SERVING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;サービス中&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The account is active.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ENDED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;サービス終了&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The account　service has ended.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
@JsonAdapter(AccountServiceStatus.Adapter.class)
public enum AccountServiceStatus {
  
  INPROGRESS("INPROGRESS"),
  
  WAIT_DECIDE("WAIT_DECIDE"),
  
  SUSPENDED("SUSPENDED"),
  
  SERVING("SERVING"),
  
  ENDED("ENDED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountServiceStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountServiceStatus fromValue(String value) {
    for (AccountServiceStatus b : AccountServiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountServiceStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountServiceStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountServiceStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountServiceStatus.fromValue(value);
    }
  }
}

