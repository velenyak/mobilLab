package com.bme.janosvelenyak.mobillab.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2002User   {
  
  @SerializedName("twitter")
  private String twitter = null;
  
  @SerializedName("avatar_url")
  private String avatarUrl = null;
  
  @SerializedName("profile_url")
  private String profileUrl = null;
  
  @SerializedName("banner_url")
  private String bannerUrl = null;
  
  @SerializedName("display_name")
  private String displayName = null;
  
  @SerializedName("username")
  private String username = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTwitter() {
    return twitter;
  }
  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getProfileUrl() {
    return profileUrl;
  }
  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getBannerUrl() {
    return bannerUrl;
  }
  public void setBannerUrl(String bannerUrl) {
    this.bannerUrl = bannerUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002User inlineResponse2002User = (InlineResponse2002User) o;
    return Objects.equals(twitter, inlineResponse2002User.twitter) &&
        Objects.equals(avatarUrl, inlineResponse2002User.avatarUrl) &&
        Objects.equals(profileUrl, inlineResponse2002User.profileUrl) &&
        Objects.equals(bannerUrl, inlineResponse2002User.bannerUrl) &&
        Objects.equals(displayName, inlineResponse2002User.displayName) &&
        Objects.equals(username, inlineResponse2002User.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(twitter, avatarUrl, profileUrl, bannerUrl, displayName, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002User {\n");
    
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    bannerUrl: ").append(toIndentedString(bannerUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
