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
import jp.co.yahoo.adssearchapi.v4.model.AuditLogServiceJobStatus;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceSelectorオブジェクトは、登録したジョブを照会するための検索条件を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceSelector object retains search criterias to inquire a created job.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AuditLogServiceSelectorオブジェクトは、登録したジョブを照会するための検索条件を保持します。</div> <div lang=\"en\">AuditLogServiceSelector object retains search criterias to inquire a created job.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AuditLogServiceSelector {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_JOB_IDS = "jobIds";
  @SerializedName(SERIALIZED_NAME_JOB_IDS)
  private List<Long> jobIds = null;

  public static final String SERIALIZED_NAME_JOB_STATUSES = "jobStatuses";
  @SerializedName(SERIALIZED_NAME_JOB_STATUSES)
  private List<AuditLogServiceJobStatus> jobStatuses = null;

  public static final String SERIALIZED_NAME_NUMBER_RESULTS = "numberResults";
  @SerializedName(SERIALIZED_NAME_NUMBER_RESULTS)
  private Integer numberResults = 500;

  public static final String SERIALIZED_NAME_START_INDEX = "startIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex = 1;


  public AuditLogServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AuditLogServiceSelector jobIds(List<Long> jobIds) {
    
    this.jobIds = jobIds;
    return this;
  }

  public AuditLogServiceSelector addJobIdsItem(Long jobIdsItem) {
    if (this.jobIds == null) {
      this.jobIds = new ArrayList<Long>();
    }
    this.jobIds.add(jobIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;登録したジョブのIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Created job ID&lt;/div&gt; 
   * @return jobIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">登録したジョブのIDです。</div> <div lang=\"en\">Created job ID</div> ")

  public List<Long> getJobIds() {
    return jobIds;
  }


  public void setJobIds(List<Long> jobIds) {
    this.jobIds = jobIds;
  }


  public AuditLogServiceSelector jobStatuses(List<AuditLogServiceJobStatus> jobStatuses) {
    
    this.jobStatuses = jobStatuses;
    return this;
  }

  public AuditLogServiceSelector addJobStatusesItem(AuditLogServiceJobStatus jobStatusesItem) {
    if (this.jobStatuses == null) {
      this.jobStatuses = new ArrayList<AuditLogServiceJobStatus>();
    }
    this.jobStatuses.add(jobStatusesItem);
    return this;
  }

   /**
   * Get jobStatuses
   * @return jobStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AuditLogServiceJobStatus> getJobStatuses() {
    return jobStatuses;
  }


  public void setJobStatuses(List<AuditLogServiceJobStatus> jobStatuses) {
    this.jobStatuses = jobStatuses;
  }


  public AuditLogServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

  public Integer getNumberResults() {
    return numberResults;
  }


  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public AuditLogServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceSelector auditLogServiceSelector = (AuditLogServiceSelector) o;
    return Objects.equals(this.accountId, auditLogServiceSelector.accountId) &&
        Objects.equals(this.jobIds, auditLogServiceSelector.jobIds) &&
        Objects.equals(this.jobStatuses, auditLogServiceSelector.jobStatuses) &&
        Objects.equals(this.numberResults, auditLogServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, auditLogServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, jobIds, jobStatuses, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
    sb.append("    jobStatuses: ").append(toIndentedString(jobStatuses)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

