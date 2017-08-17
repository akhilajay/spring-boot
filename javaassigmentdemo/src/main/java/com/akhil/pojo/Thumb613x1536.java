/**
 * 
 */
package com.akhil.pojo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"url",
"width",
"height",
"title",
"assetTypes"
})

/**
 * @author ajay
 *
 */
public class Thumb613x1536 {
	@JsonProperty("url")
	private String url;
	@JsonProperty("width")
	private Integer width;
	@JsonProperty("height")
	private Integer height;
	@JsonProperty("title")
	private String title;
	@JsonProperty("assetTypes")
	private List<String> assetTypes = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("url")
	public String getUrl() {
	return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
	this.url = url;
	}

	@JsonProperty("width")
	public Integer getWidth() {
	return width;
	}

	@JsonProperty("width")
	public void setWidth(Integer width) {
	this.width = width;
	}

	@JsonProperty("height")
	public Integer getHeight() {
	return height;
	}

	@JsonProperty("height")
	public void setHeight(Integer height) {
	this.height = height;
	}

	@JsonProperty("title")
	public String getTitle() {
	return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
	this.title = title;
	}

	@JsonProperty("assetTypes")
	public List<String> getAssetTypes() {
	return assetTypes;
	}

	@JsonProperty("assetTypes")
	public void setAssetTypes(List<String> assetTypes) {
	this.assetTypes = assetTypes;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
}
