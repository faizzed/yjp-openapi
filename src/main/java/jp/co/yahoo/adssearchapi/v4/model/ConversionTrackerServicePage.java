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
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServicePageオブジェクトは、取得されるコンバージョントラッカー情報のエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServicePage object shows entry of ConversionTracker.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServicePageオブジェクトは、取得されるコンバージョントラッカー情報のエントリーを表します。</div> <div lang=\"en\">ConversionTrackerServicePage object shows entry of ConversionTracker.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class ConversionTrackerServicePage {
  public static final String SERIALIZED_NAME_TOTAL_ALL_CONVERSION_VALUE = "totalAllConversionValue";
  @SerializedName(SERIALIZED_NAME_TOTAL_ALL_CONVERSION_VALUE)
  private String totalAllConversionValue;

  public static final String SERIALIZED_NAME_TOTAL_ALL_CONVERSIONS = "totalAllConversions";
  @SerializedName(SERIALIZED_NAME_TOTAL_ALL_CONVERSIONS)
  private Long totalAllConversions;

  public static final String SERIALIZED_NAME_TOTAL_CONVERSION_VALUE = "totalConversionValue";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONVERSION_VALUE)
  private String totalConversionValue;

  public static final String SERIALIZED_NAME_TOTAL_CONVERSIONS = "totalConversions";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONVERSIONS)
  private Long totalConversions;

  public static final String SERIALIZED_NAME_TOTAL_NUM_ENTRIES = "totalNumEntries";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM_ENTRIES)
  private Integer totalNumEntries;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<ConversionTrackerServiceValue> values = null;


  public ConversionTrackerServicePage totalAllConversionValue(String totalAllConversionValue) {
    
    this.totalAllConversionValue = totalAllConversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定の対象コンバージョン値と、対象外コンバージョン値の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total value of conversions on Auto Bidding setting and the value of conversions not on Auto Bidding setting.&lt;/div&gt; 
   * @return totalAllConversionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定の対象コンバージョン値と、対象外コンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting and the value of conversions not on Auto Bidding setting.</div> ")

  public String getTotalAllConversionValue() {
    return totalAllConversionValue;
  }


  public void setTotalAllConversionValue(String totalAllConversionValue) {
    this.totalAllConversionValue = totalAllConversionValue;
  }


  public ConversionTrackerServicePage totalAllConversions(Long totalAllConversions) {
    
    this.totalAllConversions = totalAllConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定の対象コンバージョン数と、対象外コンバージョン数の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total value of conversions on Auto Bidding setting and the value of conversions not on Auto Bidding setting.&lt;/div&gt; 
   * @return totalAllConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定の対象コンバージョン数と、対象外コンバージョン数の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting and the value of conversions not on Auto Bidding setting.</div> ")

  public Long getTotalAllConversions() {
    return totalAllConversions;
  }


  public void setTotalAllConversions(Long totalAllConversions) {
    this.totalAllConversions = totalAllConversions;
  }


  public ConversionTrackerServicePage totalConversionValue(String totalConversionValue) {
    
    this.totalConversionValue = totalConversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定の対象コンバージョン値の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total value of conversions on Auto Bidding setting.&lt;/div&gt; 
   * @return totalConversionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定の対象コンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting.</div> ")

  public String getTotalConversionValue() {
    return totalConversionValue;
  }


  public void setTotalConversionValue(String totalConversionValue) {
    this.totalConversionValue = totalConversionValue;
  }


  public ConversionTrackerServicePage totalConversions(Long totalConversions) {
    
    this.totalConversions = totalConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定の対象コンバージョン数の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total value of conversions on Auto Bidding setting.&lt;/div&gt; 
   * @return totalConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定の対象コンバージョン数の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting.</div> ")

  public Long getTotalConversions() {
    return totalConversions;
  }


  public void setTotalConversions(Long totalConversions) {
    this.totalConversions = totalConversions;
  }


  public ConversionTrackerServicePage totalNumEntries(Integer totalNumEntries) {
    
    this.totalNumEntries = totalNumEntries;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得される項目の総件数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total number of entries in the result that this page is a part of.&lt;/div&gt; 
   * @return totalNumEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result that this page is a part of.</div> ")

  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }


  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }


  public ConversionTrackerServicePage values(List<ConversionTrackerServiceValue> values) {
    
    this.values = values;
    return this;
  }

  public ConversionTrackerServicePage addValuesItem(ConversionTrackerServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<ConversionTrackerServiceValue>();
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

  public List<ConversionTrackerServiceValue> getValues() {
    return values;
  }


  public void setValues(List<ConversionTrackerServiceValue> values) {
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
    ConversionTrackerServicePage conversionTrackerServicePage = (ConversionTrackerServicePage) o;
    return Objects.equals(this.totalAllConversionValue, conversionTrackerServicePage.totalAllConversionValue) &&
        Objects.equals(this.totalAllConversions, conversionTrackerServicePage.totalAllConversions) &&
        Objects.equals(this.totalConversionValue, conversionTrackerServicePage.totalConversionValue) &&
        Objects.equals(this.totalConversions, conversionTrackerServicePage.totalConversions) &&
        Objects.equals(this.totalNumEntries, conversionTrackerServicePage.totalNumEntries) &&
        Objects.equals(this.values, conversionTrackerServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAllConversionValue, totalAllConversions, totalConversionValue, totalConversions, totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServicePage {\n");
    sb.append("    totalAllConversionValue: ").append(toIndentedString(totalAllConversionValue)).append("\n");
    sb.append("    totalAllConversions: ").append(toIndentedString(totalAllConversions)).append("\n");
    sb.append("    totalConversionValue: ").append(toIndentedString(totalConversionValue)).append("\n");
    sb.append("    totalConversions: ").append(toIndentedString(totalConversions)).append("\n");
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

