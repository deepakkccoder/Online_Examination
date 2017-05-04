package edu.mum.onlinetest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HomeController {
	@RequestMapping(value="/home", method= RequestMethod.GET)
	public String index(){
		System.out.println("Welcome !!!!!!!!!!!!!!!!!");
		return "hello";
	}
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String login(){
		return "login";
	}

}