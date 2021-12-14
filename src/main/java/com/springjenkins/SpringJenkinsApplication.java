package com.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	static Logger log = LoggerFactory.getLogger(Controller.class);
	
	public static void main(String[] args) {
		log.info("stating spring boot app");
		SpringApplication.run(SpringJenkinsApplication.class, args);
		log.info("stated spring boot app");
	}

}
