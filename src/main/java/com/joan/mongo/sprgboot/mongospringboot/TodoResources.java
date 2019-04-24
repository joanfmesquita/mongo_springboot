package com.joan.mongo.sprgboot.mongospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoResources {
	
	
	
	@GetMapping("hello")
	public String helloTodos() {
		return "Custon Route from Todos path";
	}

}
