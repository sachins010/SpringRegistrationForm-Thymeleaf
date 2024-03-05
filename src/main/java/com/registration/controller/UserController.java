package com.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registration.entity.UserDetails;
import com.registration.repository.UserRepository;

@Controller
public class UserController
{
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDetails u)
	{
		System.out.println(u);
	 
		repo.save(u);
		//session.setAttribute("message","User Register Succesfully..");
		
		return "redirect:/";
	}
}
