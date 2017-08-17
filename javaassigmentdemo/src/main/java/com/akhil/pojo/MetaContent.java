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

/**
 * @author ajay
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "startIndex", "itemsPerPage", "entryCount", "title",
		"entries" })
public class MetaContent {

	@JsonProperty("startIndex")
	private Integer startIndex;
	@JsonProperty("itemsPerPage")
	private Integer itemsPerPage;
	@JsonProperty("entryCount")
	private Integer entryCount;
	@JsonProperty("title")
	private String title;
	@JsonProperty("entries")
	private List<Entry> entries = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("startIndex")
	public Integer getStartIndex() {
		return startIndex;
	}

	@JsonProperty("startIndex")
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	@JsonProperty("itemsPerPage")
	public Integer getItemsPerPage() {
		return itemsPerPage;
	}

	@JsonProperty("itemsPerPage")
	public void setItemsPerPage(Integer itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	@JsonProperty("entryCount")
	public Integer getEntryCount() {
		return entryCount;
	}

	@JsonProperty("entryCount")
	public void setEntryCount(Integer entryCount) {
		this.entryCount = entryCount;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("entries")
	public List<Entry> getEntries() {
		return entries;
	}

	@JsonProperty("entries")
	public void setEntries(List<Entry> entries) {
		this.entries = entries;
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
