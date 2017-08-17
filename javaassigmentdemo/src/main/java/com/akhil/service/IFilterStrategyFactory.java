/**
 * 
 */
package com.akhil.service;

import com.akhil.pojo.MetaContent;

/**
 * @author ajay
 *
 */
public interface IFilterStrategyFactory {
	
	IFilterService getStrategy(String strategyName);

}
