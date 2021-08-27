package com.arijit.NewProject.controller;
import java.io.IOException;  
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}











//	@RequestMapping(value="/api")
//	public ModelAndView test (Model model) {
////		model.addAttribute("login page","login");
////		
////		return "login";
//		System.out.println("my name is arijit");
//		model.addAttribute("name", "arijit");
//		
//		List<String> imp=new ArrayList<String>(); 
//		imp.add("arijit");
//		imp.add("anupam");
//		imp.add("ram");
//		imp.add("sam??");
//		imp.add("11223");
//		model.addAttribute("k",imp);
//		return new ModelAndView ("index");
//
//	}
//	@RequestMapping("/log")
//	public ModelAndView login (Model model) {
//	model.addAttribute("login page","page");
//	return new ModelAndView ("login");
//	}
//	
//	
//	}
//	
//
