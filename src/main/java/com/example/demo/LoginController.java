package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public clas LoginController {

	

	
	static int x;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	blic void activate() {
		
		System.out.println("HIII");

	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(){
		return "Hi devops All";
	}
	

}