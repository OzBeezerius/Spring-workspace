package com.everis.bootcamp.micro1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	public TestController() {
	}
	
	@GetMapping(path="/micro1")
	public String helloWorld() {
		return "Hello World micro1";
	}
}