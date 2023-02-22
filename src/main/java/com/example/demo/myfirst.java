package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myfirst {
	
	@GetMapping
	public String Show() {
		return "hello"; 	
	}
}
