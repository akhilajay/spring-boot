package com.akhil;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.akhil.controller.MediaController;

@RunWith(SpringRunner.class)
@WebMvcTest(MediaController.class)
public class MediaControllerTests {

	@Autowired
	private MockMvc mockmvc;

	@Test
	@Ignore
	public void contextLoads() {
		try {

			MvcResult result =	(MvcResult) mockmvc.perform(MockMvcRequestBuilders.get("/helloworld").contentType(MediaType.APPLICATION_JSON)).andReturn();		
			assertEquals("{'msg':'hello world'}", result.getResponse().getContentAsString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
