package com.helloword.hello.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class HelloControler {

	@GetMapping
	public String hello() {
		return "Hello Word, percistencia";
	}
	
}
