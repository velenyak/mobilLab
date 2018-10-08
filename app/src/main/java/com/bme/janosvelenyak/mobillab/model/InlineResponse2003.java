package com.bme.janosvelenyak.mobillab.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2003   {
  
  @SerializedName("data")
  private InlineResponse200Data data = null;
  
  @SerializedName("meta")
  private InlineResponse200Meta meta = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse200Data getData() {
    return data;
  }
  public void setData(InlineResponse200Data data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse200Meta getMeta() {
    return meta;
  }
  public void setMeta(InlineResponse200Meta meta) {
    this.meta = meta;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(data, inlineResponse2003.data) &&
        Objects.equals(meta, inlineResponse2003.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
