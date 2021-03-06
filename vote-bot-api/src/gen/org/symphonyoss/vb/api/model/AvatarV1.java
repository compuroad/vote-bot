/*
 * Vote Bot API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.symphonyoss.vb.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * AvatarV1
 */

public class AvatarV1   {
  @JsonProperty("size")
  private String size = null;

  @JsonProperty("url")
  private String url = null;

  public AvatarV1 size(String size) {
    this.size = size;
    return this;
  }

   /**
   * The Avatar Size
   * @return size
  **/
  @JsonProperty("size")
  @ApiModelProperty(value = "The Avatar Size")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public AvatarV1 url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Url of the image
   * @return url
  **/
  @JsonProperty("url")
  @ApiModelProperty(value = "Url of the image")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvatarV1 avatarV1 = (AvatarV1) o;
    return Objects.equals(this.size, avatarV1.size) &&
        Objects.equals(this.url, avatarV1.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvatarV1 {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

