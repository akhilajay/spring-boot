/**
 * 
 */
package com.akhil.pojo;

/**
 * @author ajay
 *
 */
public class Filter {
	
	private String filter;
	private MetaContent metacontent;
	private String level;
	

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * @return the filter
	 */
	public String getFilter() {
		return filter;
	}
	/**
	 * @param filter the filter to set
	 */
	public void setFilter(String filter) {
		this.filter = filter;
	}
	/**
	 * @return the metacontent
	 */
	public MetaContent getMetacontent() {
		return metacontent;
	}
	/**
	 * @param metacontent the metacontent to set
	 */
	public void setMetacontent(MetaContent metacontent) {
		this.metacontent = metacontent;
	}
	
}
