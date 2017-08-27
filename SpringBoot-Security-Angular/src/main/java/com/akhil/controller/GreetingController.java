/**
 * 
 */
package com.akhil.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akhilajay
 *
 */
@RestController
public class GreetingController {
	
	@GetMapping("/greeting")
	public Greeting greeting(){
		
		return new Greeting("Hello Greetings");
	}

	class Greeting {
		
		
		
		private String id = UUID.randomUUID().toString();
		private String msg ;
		public Greeting(String messageg){
			this.msg=messageg;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		
		
	}
}
