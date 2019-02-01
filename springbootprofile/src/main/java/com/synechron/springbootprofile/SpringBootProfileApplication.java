package com.synechron.springbootprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages="com.profiles.configuration")

public class SpringBootProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}
}
