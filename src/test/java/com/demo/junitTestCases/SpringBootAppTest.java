package com.demo.junitTestCases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.junit.SpringBootApp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringBootApp.class)
public class SpringBootAppTest {
    @Test
	public void contextLoads() {
	}
}