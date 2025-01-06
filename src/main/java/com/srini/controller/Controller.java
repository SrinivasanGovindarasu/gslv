package com.srini.controller;


import com.srini.exception.CustomException;
import com.srini.model.HelloWorldBean;
import com.srini.model.User;
import com.srini.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

	@Autowired
	UserService userService;

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping(path = "/bean")
	public HelloWorldBean helloWorldBeanMethod() {
		return new HelloWorldBean("My fst msg");
	}

	@GetMapping(path = "/pathVariable/{name}")
	public HelloWorldBean pathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello, %s", name));
	}

	@GetMapping("/listOfUsers")
	public Map<Integer, User> returnUsers() {
	//	return UserService.listOfUsers();
		return null;
	}

	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable String id) throws CustomException {
//		return userService.getUserById(id);
		return null;
	}
}
