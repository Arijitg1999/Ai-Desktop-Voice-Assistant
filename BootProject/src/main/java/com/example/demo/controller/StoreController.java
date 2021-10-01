package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StroreDAo;
import com.example.demo.model.Store;

@RequestMapping("/api")
@RestController
public class StoreController {
	@Autowired
	private StroreDAo dao;

	@PostMapping("/store")
	public String test(@RequestBody List<Store> stores) {

		dao.saveAll(stores);
		return " coustamer store :" + stores.size();
	}

	@GetMapping("/storecom")
	public List<Store> getStores() {
		return (List<Store>) dao.findAll();

	}

	@GetMapping("/storecom/{permissionId}")
	public Optional<Store> findStorebyId(@PathVariable("permissionId") Integer permissionId) {
		return dao.findById(permissionId);

	}

	@PutMapping("/store")
	public Store updateProduct(@RequestBody Store store) {
		return dao.save(store);

	}

	@DeleteMapping("/store/{permissionId}")
	public String deleteById(@PathVariable("permissionId") Integer permissionId) {
		dao.deleteById(permissionId);
        return "delete is successful";
	}
}
