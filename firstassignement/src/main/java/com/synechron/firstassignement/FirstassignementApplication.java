package com.synechron.firstassignement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication(scanBasePackages="com.package2")
@SpringBootApplication

public class FirstassignementApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstassignementApplication.class, args);
		TextEditor textEditor = (TextEditor)ctx.getBean("textEditor");
		
		textEditor.spellCheck();
	}

}

