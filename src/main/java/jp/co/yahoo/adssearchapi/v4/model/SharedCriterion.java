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
import jp.co.yahoo.adssearchapi.v4.model.SharedCriterionServiceKeywordMatchType;
import jp.co.yahoo.adssearchapi.v4.model.SharedCriterionServiceUse;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SharedCriterionオブジェクトは、対象外キーワード情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SharedCriterion object holds negative keyword information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SharedCriterionオブジェクトは、対象外キーワード情報を保持します。</div> <div lang=\"en\">SharedCriterion object holds negative keyword information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class SharedCriterion {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_CRITERION_ID = "criterionId";
  @SerializedName(SERIALIZED_NAME_CRITERION_ID)
  private Long criterionId;

  public static final String SERIALIZED_NAME_KEYWORD_MATCH_TYPE = "keywordMatchType";
  @SerializedName(SERIALIZED_NAME_KEYWORD_MATCH_TYPE)
  private SharedCriterionServiceKeywordMatchType keywordMatchType;

  public static final String SERIALIZED_NAME_SHARED_LIST_ID = "sharedListId";
  @SerializedName(SERIALIZED_NAME_SHARED_LIST_ID)
  private Long sharedListId;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_USE = "use";
  @SerializedName(SERIALIZED_NAME_USE)
  private SharedCriterionServiceUse use;


  public SharedCriterion accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public SharedCriterion criterionId(Long criterionId) {
    
    this.criterionId = criterionId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クライテリオンIDです。&lt;br&gt; REMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Criterion ID.&lt;br&gt; This field is required in REMOVE operation.&lt;/div&gt; 
   * @return criterionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリオンIDです。<br> REMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Criterion ID.<br> This field is required in REMOVE operation.</div> ")

  public Long getCriterionId() {
    return criterionId;
  }


  public void setCriterionId(Long criterionId) {
    this.criterionId = criterionId;
  }


  public SharedCriterion keywordMatchType(SharedCriterionServiceKeywordMatchType keywordMatchType) {
    
    this.keywordMatchType = keywordMatchType;
    return this;
  }

   /**
   * Get keywordMatchType
   * @return keywordMatchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SharedCriterionServiceKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }


  public void setKeywordMatchType(SharedCriterionServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }


  public SharedCriterion sharedListId(Long sharedListId) {
    
    this.sharedListId = sharedListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント共有リストIDです。&lt;br&gt; ADDおよびREMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account shared list ID.&lt;br&gt; This field is required in ADD and REMOVE operation.&lt;/div&gt; 
   * @return sharedListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント共有リストIDです。<br> ADDおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Account shared list ID.<br> This field is required in ADD and REMOVE operation.</div> ")

  public Long getSharedListId() {
    return sharedListId;
  }


  public void setSharedListId(Long sharedListId) {
    this.sharedListId = sharedListId;
  }


  public SharedCriterion text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードです。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Keyword.&lt;br&gt;This field is required in ADD operation.&lt;/div&gt; 
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Keyword.<br>This field is required in ADD operation.</div> ")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public SharedCriterion use(SharedCriterionServiceUse use) {
    
    this.use = use;
    return this;
  }

   /**
   * Get use
   * @return use
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SharedCriterionServiceUse getUse() {
    return use;
  }


  public void setUse(SharedCriterionServiceUse use) {
    this.use = use;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedCriterion sharedCriterion = (SharedCriterion) o;
    return Objects.equals(this.accountId, sharedCriterion.accountId) &&
        Objects.equals(this.criterionId, sharedCriterion.criterionId) &&
        Objects.equals(this.keywordMatchType, sharedCriterion.keywordMatchType) &&
        Objects.equals(this.sharedListId, sharedCriterion.sharedListId) &&
        Objects.equals(this.text, sharedCriterion.text) &&
        Objects.equals(this.use, sharedCriterion.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, criterionId, keywordMatchType, sharedListId, text, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedCriterion {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    criterionId: ").append(toIndentedString(criterionId)).append("\n");
    sb.append("    keywordMatchType: ").append(toIndentedString(keywordMatchType)).append("\n");
    sb.append("    sharedListId: ").append(toIndentedString(sharedListId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

