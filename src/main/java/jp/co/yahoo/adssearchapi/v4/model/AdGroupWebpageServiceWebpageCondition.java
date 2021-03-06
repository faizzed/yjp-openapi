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
import jp.co.yahoo.adssearchapi.v4.model.AdGroupWebpageServiceOperator;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupWebpageServiceWebpageConditionType;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceWebpageConditionオブジェクトは、Webpageの条件を保持します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceWebpageCondition object contains the rules of webpage.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceWebpageConditionオブジェクトは、Webpageの条件を保持します。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。</div> <div lang=\"en\">AdGroupWebpageServiceWebpageCondition object contains the rules of webpage.<br> This field is required in ADD operation, and will be ignored in SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupWebpageServiceWebpageCondition {
  public static final String SERIALIZED_NAME_ARGUMENT = "argument";
  @SerializedName(SERIALIZED_NAME_ARGUMENT)
  private String argument;

  public static final String SERIALIZED_NAME_WEBPAGE_CONDITION_TYPE = "webpageConditionType";
  @SerializedName(SERIALIZED_NAME_WEBPAGE_CONDITION_TYPE)
  private AdGroupWebpageServiceWebpageConditionType webpageConditionType;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private AdGroupWebpageServiceOperator operator;


  public AdGroupWebpageServiceWebpageCondition argument(String argument) {
    
    this.argument = argument;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;条件の設定値(正規表現の指定可)です。&lt;br&gt;ADD時、このフィールドは必須です。※typeがALL_PAGESの場合は省略可能となります。SET時、このフィールドは無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Value of rule setting (Can specify regular expression)&lt;br&gt;This field is required in ADD operation, and will be ignored in SET operation. *If type is &#39;ALL_PAGES&#39;, this field is optional in ADD operation.&lt;/div&gt; 
   * @return argument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">条件の設定値(正規表現の指定可)です。<br>ADD時、このフィールドは必須です。※typeがALL_PAGESの場合は省略可能となります。SET時、このフィールドは無視されます。</div> <div lang=\"en\">Value of rule setting (Can specify regular expression)<br>This field is required in ADD operation, and will be ignored in SET operation. *If type is 'ALL_PAGES', this field is optional in ADD operation.</div> ")

  public String getArgument() {
    return argument;
  }


  public void setArgument(String argument) {
    this.argument = argument;
  }


  public AdGroupWebpageServiceWebpageCondition webpageConditionType(AdGroupWebpageServiceWebpageConditionType webpageConditionType) {
    
    this.webpageConditionType = webpageConditionType;
    return this;
  }

   /**
   * Get webpageConditionType
   * @return webpageConditionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdGroupWebpageServiceWebpageConditionType getWebpageConditionType() {
    return webpageConditionType;
  }


  public void setWebpageConditionType(AdGroupWebpageServiceWebpageConditionType webpageConditionType) {
    this.webpageConditionType = webpageConditionType;
  }


  public AdGroupWebpageServiceWebpageCondition operator(AdGroupWebpageServiceOperator operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdGroupWebpageServiceOperator getOperator() {
    return operator;
  }


  public void setOperator(AdGroupWebpageServiceOperator operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupWebpageServiceWebpageCondition adGroupWebpageServiceWebpageCondition = (AdGroupWebpageServiceWebpageCondition) o;
    return Objects.equals(this.argument, adGroupWebpageServiceWebpageCondition.argument) &&
        Objects.equals(this.webpageConditionType, adGroupWebpageServiceWebpageCondition.webpageConditionType) &&
        Objects.equals(this.operator, adGroupWebpageServiceWebpageCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argument, webpageConditionType, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceWebpageCondition {\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    webpageConditionType: ").append(toIndentedString(webpageConditionType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

