package com.sampleSpringBoot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringBootApplication {

	private static final Logger logger = LogManager.getLogger(SampleSpringBootApplication.class);

	public static void main(String[] args) {
		logger.info("Launch of SampleSpringBootApplication");
		SpringApplication.run(SampleSpringBootApplication.class, args);
	}

}
