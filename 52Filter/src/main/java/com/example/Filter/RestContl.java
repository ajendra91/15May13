package com.example.Filter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContl {
	
	@RequestMapping("/")
	public String hello(){
		return "index";
	}
	
	@RequestMapping("/app")
	public String hello2(){
		return "ajendra";
	}

}
