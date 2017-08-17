/**
 * 
 */
package com.akhil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.pojo.Filter;
import com.akhil.pojo.MetaContent;
import com.akhil.service.IFilterService;
import com.akhil.service.IFilterStrategyFactory;
import com.akhil.service.MediaServices;
import com.akhil.util.MediaUtils;

/**
 * @author ajay
 *
 */

@RestController
public class MediaController {

	@Autowired
	ResourceLoader resourceLoader;

	@Autowired
	IFilterStrategyFactory filterStrategyFactory;

	@Autowired
	MediaServices mediaService;

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "{'msg':'hello world'}";
	}

	@GetMapping("/media")
	public MetaContent media(@RequestParam String filter, @RequestParam String level) {
		/**
		 * fetch the desired filter based on the filter in request param.it is the factory pattern implementation
		 */
		@SuppressWarnings("unchecked")
		IFilterService<Filter> filterService = filterStrategyFactory.getStrategy(filter);
		
		MetaContent metaContent = MediaUtils.getMediaContent(resourceLoader);

		Filter filterVO = new Filter();
		filterVO.setFilter(filter);
		filterVO.setLevel(level);
		filterVO.setMetacontent(metaContent);
		
		/**
		 * filter goes here
		 */
		 MetaContent filteredMetaContent = filterService.execute(filterVO);
		 filterVO.setMetacontent(filteredMetaContent);
		 
		 /**
		  * doing level checking on filtered data
		  */
		MetaContent leveledMetaContent = mediaService.levelMetaContent(filterVO);
		
		return leveledMetaContent;
	}
}
