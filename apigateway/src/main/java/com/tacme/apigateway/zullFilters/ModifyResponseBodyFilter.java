/**
 * 
 */
package com.tacme.apigateway.zullFilters;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StreamUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author akhil
 *
 */
public class ModifyResponseBodyFilter extends ZuulFilter {
	
	
	
	private final Logger logger = LoggerFactory.getLogger(ModifyResponseBodyFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {

		try {
			RequestContext requestContext = RequestContext.getCurrentContext();
			InputStream is = requestContext.getResponseDataStream();
			String response = StreamUtils.copyToString(is,Charset.forName("UTF-8"));
			logger.info(response);
			requestContext.setResponseBody(response);

		} catch (IOException e) {
			logger.error(e.getMessage());
		}

		return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 999;
	}

}
