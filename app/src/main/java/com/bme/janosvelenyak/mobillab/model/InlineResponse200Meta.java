package com.bme.janosvelenyak.mobillab.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse200Meta   {
  
  @SerializedName("msg")
  private String msg = null;
  
  @SerializedName("status")
  private Integer status = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Meta inlineResponse200Meta = (InlineResponse200Meta) o;
    return Objects.equals(msg, inlineResponse200Meta.msg) &&
        Objects.equals(status, inlineResponse200Meta.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Meta {\n");
    
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
