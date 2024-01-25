package com.example.Point.of.sale;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PointOfSaleApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(PointOfSaleApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("it's a test class logger");

		assertEquals(true, true );
	}


}
