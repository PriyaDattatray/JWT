package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HomeResources {
	
	@RequestMapping("/hi")
	public String Hello(){
		return "Hello";
		
	}

}
