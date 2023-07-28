package com.interviews.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class PrevProjLrngApplication {
	private static final Logger logger = LoggerFactory.getLogger(PrevProjLrngApplication.class);

	public static void main(String[] args) {
		logger.info("PrevProjLrngApplication -> main() --> started ");
		SpringApplication.run(PrevProjLrngApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}
