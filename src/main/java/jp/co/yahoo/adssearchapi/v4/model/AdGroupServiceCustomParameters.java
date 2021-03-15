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
import jp.co.yahoo.adssearchapi.v4.model.AdGroupServiceCustomParameter;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupServiceIsRemove;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※SET時、トラッキングURLが審査中の場合、編集はできません。また、変更がない場合、審査対象とはなりません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field is optional.&lt;br&gt; *In SET operation, cannot update it when Tracking URL is in editorial review. In addition, if there is no change, it will not to be reviewed.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。<br> このフィールドは、省略可能となります。<br> ※SET時、トラッキングURLが審査中の場合、編集はできません。また、変更がない場合、審査対象とはなりません。</div> <div lang=\"en\">AdGroupServiceCustomParameters displays the setting of custom parameters.<br> This field is optional.<br> *In SET operation, cannot update it when Tracking URL is in editorial review. In addition, if there is no change, it will not to be reviewed.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupServiceCustomParameters {
  public static final String SERIALIZED_NAME_IS_REMOVE = "isRemove";
  @SerializedName(SERIALIZED_NAME_IS_REMOVE)
  private AdGroupServiceIsRemove isRemove;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<AdGroupServiceCustomParameter> parameters = null;


  public AdGroupServiceCustomParameters isRemove(AdGroupServiceIsRemove isRemove) {
    
    this.isRemove = isRemove;
    return this;
  }

   /**
   * Get isRemove
   * @return isRemove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdGroupServiceIsRemove getIsRemove() {
    return isRemove;
  }


  public void setIsRemove(AdGroupServiceIsRemove isRemove) {
    this.isRemove = isRemove;
  }


  public AdGroupServiceCustomParameters parameters(List<AdGroupServiceCustomParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public AdGroupServiceCustomParameters addParametersItem(AdGroupServiceCustomParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<AdGroupServiceCustomParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AdGroupServiceCustomParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<AdGroupServiceCustomParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceCustomParameters adGroupServiceCustomParameters = (AdGroupServiceCustomParameters) o;
    return Objects.equals(this.isRemove, adGroupServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, adGroupServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceCustomParameters {\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

