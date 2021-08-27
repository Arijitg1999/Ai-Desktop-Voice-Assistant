package com.arijit.NewProject.controller;

import java.io.File;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
public class FormController {
	@RequestMapping("/name")
	public String Form() {
	return "contact";
	
	}
	
	@RequestMapping ( value="/pro" , method=RequestMethod.POST) 
	public ResponseEntity<?> process (@RequestBody User user,Model model ) throws JsonProcessingException {
//		@RequestParam("email")String useremail,
//		@RequestParam("name")String username,
//		@RequestParam("password")String password,Model model)
//	{	
//	public ModelAndView modelAndView () {
//		model.addAttribute("email", useremail);
//		model.addAttribute("name", username);
//		model.addAttribute("password", password);  @RequestBody User user,Model model  @RequestBody User user,Model model
		
		ObjectMapper objectMapper = new ObjectMapper();
//		Car car = new Car("yellow", "renault");
//		User user = new User ()
//		objectMapper.writeValue(new File("/car.json"), car);
//		User user = new User();
//		user.setEmail("ghghg");
//		user.setName("gfg");
//		user.setPassword("gfgf");
//			
			
		return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
				
	}
	
	
}



