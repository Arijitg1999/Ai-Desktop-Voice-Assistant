package com.arijit.MvcProject.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.arijit.MvcProject.entity.User;
//import com.arijit.MvcProject.model.RequestData;
//import com.arijit.MvcProject.service.Imp;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

//
//	import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//	import org.springframework.http.ResponseEntity;
//	//import org.springframework.stereotype.Controller;
//	import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.ModelAttribute;
//	import org.springframework.web.bind.annotation.RequestBody;
//	import org.springframework.web.bind.annotation.RequestMapping;
//	import org.springframework.web.bind.annotation.RequestMethod;
//	//import org.springframework.web.bind.annotation.RequestParam;
//	import org.springframework.web.bind.annotation.RestController;
//	//import org.springframework.web.servlet.ModelAndView;
//
//	import com.arijit.MvcProject.entity.User;
//
//	import com.fasterxml.jackson.core.JsonProcessingException;
//	import com.fasterxml.jackson.databind.ObjectMapper;
//	@RestController
//	public class FormController {
//	  
////		@Autowired
////		Imp imp;
////		
//		
//		
//		//@RequestMapping ( value="/pro" , method=RequestMethod.POST)//,consumes=MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE) 
//		
//		@PostMapping( value = "/pos")
//		public ResponseEntity<?> process (@RequestBody User user,Model model ) throws JsonProcessingException {
//
////		model.addAttribute(user);
//		System.out.println("__> "+ user);
////		imp.crateUser(user);
////			ObjectMapper objectMapper = new ObjectMapper();	
////			return ResponseEntity.ok().body(user);
//			return ResponseEntity.ok().body(user);
//						
//		}
//		
//		
//	}





//@RestController
//public class FormController {
//	
//
//	@RequestMapping ( value="/pro", method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
//	public  ResponseEntity<?> process (@RequestBody User user,Model model ) throws JsonProcessingException {
////	ObjectMapper objectMapper=new ObjectMapper();
////	return  ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
//	
//		model.addAttribute(user);
////		System.out.println("__> "+ user);
//		Imp imp = new Imp();
//		
//		try {
//			imp.setData(user);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return ResponseEntity.ok().body(user);
	
	
	
	

//import java.io.File;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;

import com.arijit.MvcProject.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
public class FormController  {

	
	@RequestMapping ( value="/pro" , method=RequestMethod.POST) 
	public ResponseEntity<?> process (@RequestBody User user,Model model ) throws JsonProcessingException {

		
		ObjectMapper objectMapper = new ObjectMapper();	
		return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
					
	}
	
	

	
	
	
	
	
	
	
	
//	
//	@PostMapping( value = "/pos")
//	public ResponseEntity<?> process (@RequestBody User user,Model model ) throws JsonProcessingException {
//
//	model.addAttribute(user);
//	System.out.println("__> "+ user);
//	
//		ObjectMapper objectMapper = new ObjectMapper();	
//		return ResponseEntity.ok().body(user);
//		return ResponseEntity.ok().body(user);
	}


