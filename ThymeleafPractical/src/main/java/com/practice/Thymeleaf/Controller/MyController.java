package com.practice.Thymeleaf.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping(value = "/about")
	public String about(Model model) {
		System.out.println("Inside Handler!!");
		model.addAttribute("name", "Saswata");
		model.addAttribute("Date", new Date());
		return "about";
	}

	// handle Iteration.
	@GetMapping(value = "/iteration")
	public String itertaion(Model model) {
		List<String> nameList = List.of("Saswata", "Goswami", "Arpita", "Biswas");
		model.addAttribute("name", nameList);
		return "iteration";
	}

	// handler for Conditioning.
	@GetMapping(value = "/condition")
	public String condhandler(Model model) {

		model.addAttribute("active",false);
		model.addAttribute("Male","M");
		
		List<Integer>aList=List.of(12,2,1);
		model.addAttribute("list", aList);
		return "Condtion";
	}
	
	//handler for including fragments
	@GetMapping(value="/service")
	public String frage(Model m) 
	{
		m.addAttribute("title","THis is the FuckingS Subtitle");
		m.addAttribute("Subtitle","This is the Subtitile");
		return "service";
	}

}
