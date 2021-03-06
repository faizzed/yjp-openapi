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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceFilterOperatorは、フィルタ条件を表します。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceFilterOperator displays filtering conditions for the report.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;EQUALS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定の値と一致します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Equal to selected value.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NOT_EQUALS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定の値と一致しません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Does not equals to selected value.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GREATER_THAN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定の値を超えます。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Greater than selected value.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GREATER_THAN_EQUALS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定の値以上です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Greater than equals to selected value.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LESS_THAN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定の値未満です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Less than selected value.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LESS_THAN_EQUALS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定の値以下です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Less than equals to selected value.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONTAINS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定の値を含みます。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Contains the selected value.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;いずれかに一致します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Equals to whichever of selected value.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
@JsonAdapter(ReportDefinitionServiceFilterOperator.Adapter.class)
public enum ReportDefinitionServiceFilterOperator {
  
  EQUALS("EQUALS"),
  
  NOT_EQUALS("NOT_EQUALS"),
  
  GREATER_THAN("GREATER_THAN"),
  
  GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
  
  LESS_THAN("LESS_THAN"),
  
  LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
  
  CONTAINS("CONTAINS"),
  
  IN("IN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceFilterOperator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportDefinitionServiceFilterOperator fromValue(String value) {
    for (ReportDefinitionServiceFilterOperator b : ReportDefinitionServiceFilterOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportDefinitionServiceFilterOperator> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportDefinitionServiceFilterOperator enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportDefinitionServiceFilterOperator read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportDefinitionServiceFilterOperator.fromValue(value);
    }
  }
}

