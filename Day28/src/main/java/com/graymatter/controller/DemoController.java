package com.graymatter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {
	
	@GetMapping("/demo")
	public String sayHello()
	{
		return "hello...";
	}
	
	@GetMapping("/name/{name}")
	public String printName(@PathVariable("name") String name)
	{
		return name;
	}

	@GetMapping("/login")
	public ModelAndView login()
	{
		return new ModelAndView("login.jsp");
	}
}
