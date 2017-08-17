/**
 * 
 */
package com.akhil.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pid", "url", "restrictionId" })
/**
 * @author ajay
 *
 */
public class Release {
	@JsonProperty("pid")
	private String pid;
	@JsonProperty("url")
	private String url;
	@JsonProperty("restrictionId")
	private String restrictionId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("pid")
	public String getPid() {
		return pid;
	}

	@JsonProperty("pid")
	public void setPid(String pid) {
		this.pid = pid;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("restrictionId")
	public String getRestrictionId() {
		return restrictionId;
	}

	@JsonProperty("restrictionId")
	public void setRestrictionId(String restrictionId) {
		this.restrictionId = restrictionId;
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
