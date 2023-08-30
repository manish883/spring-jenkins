package com.example.spring.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		//assertEquals(true,true);
		logger.info("test case execution...");
		logger.info("test case execution second...");
		logger.info("test case execution third...");
	}

}
