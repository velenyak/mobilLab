package com.bme.janosvelenyak.mobillab.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse200ImagesLooping   {
  
  @SerializedName("mp4")
  private String mp4 = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMp4() {
    return mp4;
  }
  public void setMp4(String mp4) {
    this.mp4 = mp4;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200ImagesLooping inlineResponse200ImagesLooping = (InlineResponse200ImagesLooping) o;
    return Objects.equals(mp4, inlineResponse200ImagesLooping.mp4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mp4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ImagesLooping {\n");
    
    sb.append("    mp4: ").append(toIndentedString(mp4)).append("\n");
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
