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
import jp.co.yahoo.adssearchapi.v4.model.DictionaryServiceGeographicLocation;
import jp.co.yahoo.adssearchapi.v4.model.Error;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationValueオブジェクトは、地域情報と処理の内容を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocationValue object describes Geographic location and operation information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationValueオブジェクトは、地域情報と処理の内容を表します。</div> <div lang=\"en\">DictionaryServiceGeographicLocationValue object describes Geographic location and operation information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class DictionaryServiceGeographicLocationValue {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_GEOGRAPHIC_LOCATION = "geographicLocation";
  @SerializedName(SERIALIZED_NAME_GEOGRAPHIC_LOCATION)
  private DictionaryServiceGeographicLocation geographicLocation;

  public static final String SERIALIZED_NAME_OPERATION_SUCCEEDED = "operationSucceeded";
  @SerializedName(SERIALIZED_NAME_OPERATION_SUCCEEDED)
  private Boolean operationSucceeded;


  public DictionaryServiceGeographicLocationValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public DictionaryServiceGeographicLocationValue addErrorsItem(Error errorsItem) {
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


  public DictionaryServiceGeographicLocationValue geographicLocation(DictionaryServiceGeographicLocation geographicLocation) {
    
    this.geographicLocation = geographicLocation;
    return this;
  }

   /**
   * Get geographicLocation
   * @return geographicLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DictionaryServiceGeographicLocation getGeographicLocation() {
    return geographicLocation;
  }


  public void setGeographicLocation(DictionaryServiceGeographicLocation geographicLocation) {
    this.geographicLocation = geographicLocation;
  }


  public DictionaryServiceGeographicLocationValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オペレーション成功です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Operation is successful.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">オペレーション成功です。</div> <div lang=\"en\">Operation is successful.</div> ")

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
    DictionaryServiceGeographicLocationValue dictionaryServiceGeographicLocationValue = (DictionaryServiceGeographicLocationValue) o;
    return Objects.equals(this.errors, dictionaryServiceGeographicLocationValue.errors) &&
        Objects.equals(this.geographicLocation, dictionaryServiceGeographicLocationValue.geographicLocation) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceGeographicLocationValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, geographicLocation, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceGeographicLocationValue {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    geographicLocation: ").append(toIndentedString(geographicLocation)).append("\n");
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

