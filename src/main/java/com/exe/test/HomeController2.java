package com.exe.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController2 {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("AAA");
		return "home";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "home";
	}
	
}
