package com.synechron.propertydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	/*
	@Value(value="${demo.name}")
	public String name;
	
	@Value(value="${demo.addr}")
	public String address;
	
	
	@GetMapping("/name")
	public String retrunName()
	{
		return name;
	}
	
	@GetMapping("/address")
	public String retrunAddr()
	{
		return address;
	}*/
	
	
	@Autowired
	Environment env;
	
	@GetMapping("/simple")
	public String simple()
	{
		return "<h1>" + env.getProperty("name") +"</h1>" 
				+ "<h1>" + env.getProperty("demo.addr") +"</h1>" 
				+ "<h1>" + env.getProperty("demo.name1") +"</h1>" 
				+ "<h1>" + env.getProperty("demo.addr1") +"</h1>" ;
	}
	
	
	

}
