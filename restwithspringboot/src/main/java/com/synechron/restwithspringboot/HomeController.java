package com.synechron.restwithspringboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello2";
	}
	
	
	@RequestMapping(value="/home/{id}")
	public int sayHello(@PathVariable("id") int id) {		
		return id;
	}
}
