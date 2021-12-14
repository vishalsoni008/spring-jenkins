package com.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	Logger log = LoggerFactory.getLogger(Controller.class);
	
	@GetMapping("/")
	public String demo() {
		return "hello";
	}

	@GetMapping("/")
	public String demos() {
		return "hello2";
	}
}
