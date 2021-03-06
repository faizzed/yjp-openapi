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
import jp.co.yahoo.adssearchapi.v4.model.AdGroupBidMultiplierServiceReturnValue;
import jp.co.yahoo.adssearchapi.v4.model.Error;

/**
 * AdGroupBidMultiplierServiceMutateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupBidMultiplierServiceMutateResponse {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_RID = "rid";
  @SerializedName(SERIALIZED_NAME_RID)
  private String rid;

  public static final String SERIALIZED_NAME_RVAL = "rval";
  @SerializedName(SERIALIZED_NAME_RVAL)
  private AdGroupBidMultiplierServiceReturnValue rval;


  public AdGroupBidMultiplierServiceMutateResponse errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdGroupBidMultiplierServiceMutateResponse addErrorsItem(Error errorsItem) {
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


  public AdGroupBidMultiplierServiceMutateResponse rid(String rid) {
    
    this.rid = rid;
    return this;
  }

   /**
   * Get rid
   * @return rid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRid() {
    return rid;
  }


  public void setRid(String rid) {
    this.rid = rid;
  }


  public AdGroupBidMultiplierServiceMutateResponse rval(AdGroupBidMultiplierServiceReturnValue rval) {
    
    this.rval = rval;
    return this;
  }

   /**
   * Get rval
   * @return rval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdGroupBidMultiplierServiceReturnValue getRval() {
    return rval;
  }


  public void setRval(AdGroupBidMultiplierServiceReturnValue rval) {
    this.rval = rval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupBidMultiplierServiceMutateResponse adGroupBidMultiplierServiceMutateResponse = (AdGroupBidMultiplierServiceMutateResponse) o;
    return Objects.equals(this.errors, adGroupBidMultiplierServiceMutateResponse.errors) &&
        Objects.equals(this.rid, adGroupBidMultiplierServiceMutateResponse.rid) &&
        Objects.equals(this.rval, adGroupBidMultiplierServiceMutateResponse.rval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupBidMultiplierServiceMutateResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
    sb.append("    rval: ").append(toIndentedString(rval)).append("\n");
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

