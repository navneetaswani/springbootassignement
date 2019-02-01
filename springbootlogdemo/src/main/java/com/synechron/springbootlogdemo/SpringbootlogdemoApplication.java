package com.synechron.springbootlogdemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootlogdemoApplication {

	public static Logger logger =   LoggerFactory.getLogger(SpringBootApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootlogdemoApplication.class, args);
		
		logger.info("this is log info");
		logger.warn("this is log warn");
		logger.error("this is error log");
		
		
	}

}

