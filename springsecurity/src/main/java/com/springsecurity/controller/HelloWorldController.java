package com.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "HelloWorld";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "HelloWorld1";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "hi";
	}
	
	
}
