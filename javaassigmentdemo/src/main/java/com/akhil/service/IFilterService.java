/**
 * 
 */
package com.akhil.service;

import com.akhil.pojo.MetaContent;

/**
 * @author akhil
 *
 */
public interface IFilterService<I>{

	public MetaContent execute(I inputObject);
	
}
