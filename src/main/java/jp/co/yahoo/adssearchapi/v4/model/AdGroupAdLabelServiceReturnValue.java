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
import jp.co.yahoo.adssearchapi.v4.model.AdGroupAdLabelServiceValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdLabelServiceReturnValueオブジェクトは、広告のラベル情報を含む操作結果として戻される値を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdLabelServiceReturnValue object describes value returned as operation result including ad group ad label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdLabelServiceReturnValueオブジェクトは、広告のラベル情報を含む操作結果として戻される値を表します。</div> <div lang=\"en\">AdGroupAdLabelServiceReturnValue object describes value returned as operation result including ad group ad label information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupAdLabelServiceReturnValue {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<AdGroupAdLabelServiceValue> values = null;


  public AdGroupAdLabelServiceReturnValue values(List<AdGroupAdLabelServiceValue> values) {
    
    this.values = values;
    return this;
  }

  public AdGroupAdLabelServiceReturnValue addValuesItem(AdGroupAdLabelServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<AdGroupAdLabelServiceValue>();
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

  public List<AdGroupAdLabelServiceValue> getValues() {
    return values;
  }


  public void setValues(List<AdGroupAdLabelServiceValue> values) {
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
    AdGroupAdLabelServiceReturnValue adGroupAdLabelServiceReturnValue = (AdGroupAdLabelServiceReturnValue) o;
    return Objects.equals(this.values, adGroupAdLabelServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdLabelServiceReturnValue {\n");
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
