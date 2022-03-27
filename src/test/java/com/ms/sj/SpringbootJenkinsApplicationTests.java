package com.ms.sj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(SpringbootJenkinsApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing..");
		logger.info("Test case executing second log message..");
		assertEquals(true, true );
	}

}
