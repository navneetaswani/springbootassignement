package com.synechron.springbootactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloActuatorController {

	//@GetMapping("/helloactuator")
	@RequestMapping(value="/helloactuator",method=RequestMethod.GET)
	public String helloActuator() {
		return "Hello Spring boot Actuator";
	}
}
