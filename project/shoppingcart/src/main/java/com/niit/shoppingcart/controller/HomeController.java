package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcart.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String getIndexPage(){
		return "index";
	}

	@RequestMapping("home")
	public String getHomePage(){
		return "home";    //your page name
	}
	@RequestMapping("signup")
	public String getsignup(){
		return "signup";    //your signup page
	}
	
	@RequestMapping("register")
	public String setnewuser(@ModelAttribute("user") User user){
		userService.saveuser(user);
		return "index";
	}
}
