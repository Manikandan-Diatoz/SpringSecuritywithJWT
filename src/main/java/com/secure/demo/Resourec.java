package com.secure.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resourec {

	@GetMapping("/")
	public String home()
	{
		return "welcome ";
	}
	@GetMapping("/user")
	public String user()
	{
		return "Welcome user";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "Welcome Admin";
	}
	@GetMapping("/admin/company")
	public String admin1()
	{
		return "Welcome AdminCompany";
	}
}
