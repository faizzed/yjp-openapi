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
import jp.co.yahoo.adssearchapi.v4.model.AdGroupCriterion;
import jp.co.yahoo.adssearchapi.v4.model.Error;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceValueオブジェクトは、広告グループのクライテリアです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceValue object is ad group criteria information including its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceValueオブジェクトは、広告グループのクライテリアです。</div> <div lang=\"en\">AdGroupCriterionServiceValue object is ad group criteria information including its operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupCriterionServiceValue {
  public static final String SERIALIZED_NAME_AD_GROUP_CRITERION = "adGroupCriterion";
  @SerializedName(SERIALIZED_NAME_AD_GROUP_CRITERION)
  private AdGroupCriterion adGroupCriterion;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_OPERATION_SUCCEEDED = "operationSucceeded";
  @SerializedName(SERIALIZED_NAME_OPERATION_SUCCEEDED)
  private Boolean operationSucceeded;


  public AdGroupCriterionServiceValue adGroupCriterion(AdGroupCriterion adGroupCriterion) {
    
    this.adGroupCriterion = adGroupCriterion;
    return this;
  }

   /**
   * Get adGroupCriterion
   * @return adGroupCriterion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdGroupCriterion getAdGroupCriterion() {
    return adGroupCriterion;
  }


  public void setAdGroupCriterion(AdGroupCriterion adGroupCriterion) {
    this.adGroupCriterion = adGroupCriterion;
  }


  public AdGroupCriterionServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdGroupCriterionServiceValue addErrorsItem(Error errorsItem) {
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


  public AdGroupCriterionServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Result of process&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Result of process</div> ")

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
    AdGroupCriterionServiceValue adGroupCriterionServiceValue = (AdGroupCriterionServiceValue) o;
    return Objects.equals(this.adGroupCriterion, adGroupCriterionServiceValue.adGroupCriterion) &&
        Objects.equals(this.errors, adGroupCriterionServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupCriterionServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupCriterion, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceValue {\n");
    sb.append("    adGroupCriterion: ").append(toIndentedString(adGroupCriterion)).append("\n");
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

