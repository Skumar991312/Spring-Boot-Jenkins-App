package com.jenkins.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping("/wel")
	public String getMsg() {
		String name="Welcome To SpringBoot Applications";
		return name;
	}

}
