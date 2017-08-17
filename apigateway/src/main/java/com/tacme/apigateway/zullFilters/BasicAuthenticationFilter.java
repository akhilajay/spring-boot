/**
 * 
 */
package com.tacme.apigateway.zullFilters;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.tacme.apigateway.properties.Credentials;

/**
 * @author akhil
 *
 */
public class BasicAuthenticationFilter extends ZuulFilter {

	private final Logger logger = LoggerFactory.getLogger(BasicAuthenticationFilter.class);

	@Autowired
	Credentials credentials;

	@Override
	public Object run() {

		String authStr = credentials.getUsername() + ":"+ credentials.getPassword();
		String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
		RequestContext ctx = RequestContext.getCurrentContext();
		logger.info("rerouting Url is " + ctx.getRequest().getRequestURL());
		ctx.addZuulRequestHeader("Authorization", "Basic " + authEncoded);
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
