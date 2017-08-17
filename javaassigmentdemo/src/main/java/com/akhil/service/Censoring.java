/**
 * 
 */
package com.akhil.service;

import com.akhil.pojo.Filter;
import com.akhil.pojo.MetaContent;

/**
 * @author ajay
 *
 */

public class Censoring implements IFilterService<Filter>{

	@Override
	public MetaContent execute(Filter inputObject) {
		// TODO FilterLogic goes here
		return inputObject.getMetacontent();
	}



}
