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
import jp.co.yahoo.adssearchapi.v4.model.AdGroupCriterionLabel;
import jp.co.yahoo.adssearchapi.v4.model.Error;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionLabelServiceValueオブジェクトは、操作結果を含む広告グループのクライテリアラベル情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionLabelServiceValue object describes ad group criterion label information including its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionLabelServiceValueオブジェクトは、操作結果を含む広告グループのクライテリアラベル情報を表します。</div> <div lang=\"en\">AdGroupCriterionLabelServiceValue object describes ad group criterion label information including its operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupCriterionLabelServiceValue {
  public static final String SERIALIZED_NAME_AD_GROUP_CRITERION_LABEL = "adGroupCriterionLabel";
  @SerializedName(SERIALIZED_NAME_AD_GROUP_CRITERION_LABEL)
  private AdGroupCriterionLabel adGroupCriterionLabel;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_OPERATION_SUCCEEDED = "operationSucceeded";
  @SerializedName(SERIALIZED_NAME_OPERATION_SUCCEEDED)
  private Boolean operationSucceeded;


  public AdGroupCriterionLabelServiceValue adGroupCriterionLabel(AdGroupCriterionLabel adGroupCriterionLabel) {
    
    this.adGroupCriterionLabel = adGroupCriterionLabel;
    return this;
  }

   /**
   * Get adGroupCriterionLabel
   * @return adGroupCriterionLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdGroupCriterionLabel getAdGroupCriterionLabel() {
    return adGroupCriterionLabel;
  }


  public void setAdGroupCriterionLabel(AdGroupCriterionLabel adGroupCriterionLabel) {
    this.adGroupCriterionLabel = adGroupCriterionLabel;
  }


  public AdGroupCriterionLabelServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdGroupCriterionLabelServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public AdGroupCriterionLabelServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionLabelServiceValue adGroupCriterionLabelServiceValue = (AdGroupCriterionLabelServiceValue) o;
    return Objects.equals(this.adGroupCriterionLabel, adGroupCriterionLabelServiceValue.adGroupCriterionLabel) &&
        Objects.equals(this.errors, adGroupCriterionLabelServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupCriterionLabelServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupCriterionLabel, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionLabelServiceValue {\n");
    sb.append("    adGroupCriterionLabel: ").append(toIndentedString(adGroupCriterionLabel)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

