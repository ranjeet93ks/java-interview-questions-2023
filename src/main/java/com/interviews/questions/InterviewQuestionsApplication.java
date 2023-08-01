package com.interviews.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class InterviewQuestionsApplication {
	private static final Logger logger = LoggerFactory.getLogger(InterviewQuestionsApplication.class);

	public static void main(String[] args) {
		logger.info("PrevProjLrngApplication -> main() --> started ");
		SpringApplication.run(InterviewQuestionsApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}
