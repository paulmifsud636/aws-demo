package com.example.demoaws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	
	@RequestMapping("/getname")
	public String getName() {
		return "This is my project demo";
	}

}
