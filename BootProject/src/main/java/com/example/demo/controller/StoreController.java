package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StroreDAo;
import com.example.demo.model.Store;
@RequestMapping("/api")
@RestController
public class StoreController {
	@Autowired
	private  StroreDAo dao;
	
	@PostMapping("/store")
	public String  test(@RequestBody ArrayList<Store> stores) {
		
		dao.saveAll(stores);
		return " coustamer store :" +stores.size();
	}

	@GetMapping("/storecom")
	public List<Store>getStores() {
		return (List<Store>) dao.findAll();
		
	}
}
