package com.everis.bootcamp.micro2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	public TestController() {
	}
	
	@GetMapping(path="/micro2")
	public String helloWorld() {
		return "Hello World micro2";
	}
}
