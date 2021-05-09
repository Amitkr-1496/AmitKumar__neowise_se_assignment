package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cust")
public class CustomerController {
	
	
	
	@RequestMapping("/add")
	public String addCust() {
		
		
		return "Hello";
		
		
	}
	
	
	
	

}
