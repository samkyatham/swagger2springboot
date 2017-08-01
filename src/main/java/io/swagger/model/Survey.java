package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Question;

/**
 * Survey
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-01T17:52:06.007Z")

public class Survey   {
  @JsonProperty("surveyId")
  private Long surveyId = null;

  @JsonProperty("surveyName")
  private String surveyName = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  /**
   * Survey Status
   */
  public enum StatusEnum {
    CREATED("created"),
    
    INPROGRESS("inprogress"),
    
    COMPLETED("completed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("questions")
  private Question questions = null;

  public Survey surveyId(Long surveyId) {
    this.surveyId = surveyId;
    return this;
  }

   /**
   * Get surveyId
   * @return surveyId
  **/
  @ApiModelProperty(value = "")
  public Long getSurveyId() {
    return surveyId;
  }

  public void setSurveyId(Long surveyId) {
    this.surveyId = surveyId;
  }

  public Survey surveyName(String surveyName) {
    this.surveyName = surveyName;
    return this;
  }

   /**
   * Get surveyName
   * @return surveyName
  **/
  @ApiModelProperty(value = "")
  public String getSurveyName() {
    return surveyName;
  }

  public void setSurveyName(String surveyName) {
    this.surveyName = surveyName;
  }

  public Survey company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Survey createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Survey status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Survey Status
   * @return status
  **/
  @ApiModelProperty(value = "Survey Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Survey questions(Question questions) {
    this.questions = questions;
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")
  public Question getQuestions() {
    return questions;
  }

  public void setQuestions(Question questions) {
    this.questions = questions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Survey survey = (Survey) o;
    return Objects.equals(this.surveyId, survey.surveyId) &&
        Objects.equals(this.surveyName, survey.surveyName) &&
        Objects.equals(this.company, survey.company) &&
        Objects.equals(this.createdBy, survey.createdBy) &&
        Objects.equals(this.status, survey.status) &&
        Objects.equals(this.questions, survey.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyId, surveyName, company, createdBy, status, questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Survey {\n");
    
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
    sb.append("    surveyName: ").append(toIndentedString(surveyName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

