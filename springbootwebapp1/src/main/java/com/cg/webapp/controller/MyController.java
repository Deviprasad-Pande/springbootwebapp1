package com.cg.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/home")
	public String sayHello() {

		
		return "welcome"; //this returned value will be the logical name of physical jsp page
	
	}
		@RequestMapping("/login")
		public String lainchloginPage() {

			
			return "login";
	
	}
}
