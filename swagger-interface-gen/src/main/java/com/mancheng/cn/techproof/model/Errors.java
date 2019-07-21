package com.mancheng.cn.techproof.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * error model for exception
 */
@ApiModel(description = "error model for exception")
@Validated
public class Errors   {
  @JsonProperty("errorList")
  @Valid
  private List<String> errorList = null;

  public Errors errorList(List<String> errorList) {
    this.errorList = errorList;
    return this;
  }

  public Errors addErrorListItem(String errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<String>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

  /**
   * Get errorList
   * @return errorList
  **/
  @ApiModelProperty(value = "")

  public List<String> getErrorList() {
    return errorList;
  }

  public void setErrorList(List<String> errorList) {
    this.errorList = errorList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Errors errors = (Errors) o;
    return Objects.equals(this.errorList, errors.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Errors {\n");
    
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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
