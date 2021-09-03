package com.arijit.MvcProject.controller;



	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;


	@Controller
	public class ControllerClass {
		
		
		@RequestMapping("/name")
		public String Form() {
		return "contact";
		}


	}