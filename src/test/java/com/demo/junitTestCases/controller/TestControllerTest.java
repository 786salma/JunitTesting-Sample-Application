package com.demo.junitTestCases.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.results.ResultMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import com.demo.junitTestCases.SpringBootAppTest;



public class TestControllerTest extends SpringBootAppTest{
	@Autowired
	private WebApplicationContext webApplicationContext;
	private MockMvc mockMvc;
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	@Test
	public void testEmployee() throws Exception {
		mockMvc.perform(get("/employee")).andExpect(status().isOk())
		                                 .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		
		                                 .andExpect(content().json("{\"empId\":\"1\",\"name\":\"Salma\",\"designation\":\"Developer\",\"salary\":10000.0}"))
		                                   .andDo(print());
	}
		
	


   }
	

