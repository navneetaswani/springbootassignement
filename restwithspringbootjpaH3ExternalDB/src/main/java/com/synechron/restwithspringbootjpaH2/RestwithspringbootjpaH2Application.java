package com.synechron.restwithspringbootjpaH2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.synechron.restwithspringbootjpaH2")
@EnableJpaRepositories(basePackages="com.synechron.restwithspringbootjpaH2")
@EntityScan(basePackages="com.synechron.restwithspringbootjpaH2")
public class RestwithspringbootjpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestwithspringbootjpaH2Application.class, args);
	}

}

