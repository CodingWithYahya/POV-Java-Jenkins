package com.example.Point.of.sale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PointOfSaleApplication implements CommandLineRunner {
	public static final Logger logger = LoggerFactory.getLogger(PointOfSaleApplication.class);

	public static void main(String[] args) {
		logger.info("it's a continous integration job");
		SpringApplication.run(PointOfSaleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("its my seond logger");
	}
}
