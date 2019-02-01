package com.synechron.propertydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value= {"app.yml","app2.yml"})
public class PropertydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertydemoApplication.class, args);
	}

}

