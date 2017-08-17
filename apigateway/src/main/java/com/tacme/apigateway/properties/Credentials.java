/**
 * 
 */
package com.tacme.apigateway.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author akhil
 *
 */
@Component
public class Credentials {

	@Value("${qmatic.username}")
	private String username;
	@Value("${qmatic.password}")
	private String password;
	@Value("${qmatic.mobileusername}")
	private String mobileusername;
	@Value("${qmatic.mobilepassword}")
	private String mobilepassword;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileusername() {
		return mobileusername;
	}

	public void setMobileusername(String mobileusername) {
		this.mobileusername = mobileusername;
	}

	public String getMobilepassword() {
		return mobilepassword;
	}

	public void setMobilepassword(String mobilepassword) {
		this.mobilepassword = mobilepassword;
	}

}
