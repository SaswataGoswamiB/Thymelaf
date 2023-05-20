package com.practice.Thymeleaf.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping(value = "/about")
	public String about(Model model) 
	{
		System.out.println("Inside Handler!!");
		model.addAttribute("name","Saswata");
		model.addAttribute("Date",new Date());
		return "about";
	}

}
