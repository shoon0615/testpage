package com.exe.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController4 {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test() {
		System.out.println("ABC");
		return "test2";
		
	}	
}
