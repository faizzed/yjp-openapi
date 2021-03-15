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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupServiceValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServicePageオブジェクトは、取得される広告グループに関するエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServicePage object displays entries for Ad group.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServicePageオブジェクトは、取得される広告グループに関するエントリーを表します。</div> <div lang=\"en\">AdGroupServicePage object displays entries for Ad group.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupServicePage {
  public static final String SERIALIZED_NAME_TOTAL_NUM_ENTRIES = "totalNumEntries";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM_ENTRIES)
  private Integer totalNumEntries;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<AdGroupServiceValue> values = null;


  public AdGroupServicePage totalNumEntries(Integer totalNumEntries) {
    
    this.totalNumEntries = totalNumEntries;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得される項目の総件数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total number of entries in the result.&lt;/div&gt; 
   * @return totalNumEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result.</div> ")

  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }


  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }


  public AdGroupServicePage values(List<AdGroupServiceValue> values) {
    
    this.values = values;
    return this;
  }

  public AdGroupServicePage addValuesItem(AdGroupServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<AdGroupServiceValue>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AdGroupServiceValue> getValues() {
    return values;
  }


  public void setValues(List<AdGroupServiceValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServicePage adGroupServicePage = (AdGroupServicePage) o;
    return Objects.equals(this.totalNumEntries, adGroupServicePage.totalNumEntries) &&
        Objects.equals(this.values, adGroupServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServicePage {\n");
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

}

