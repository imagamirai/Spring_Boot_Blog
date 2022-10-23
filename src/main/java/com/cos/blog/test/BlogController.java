package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
	
	@GetMapping("/test/hello")
	public String hello() {
		String txt = "<h1> hello spring boot 0<h1>" ;
		
		return txt ; 
	}
}
