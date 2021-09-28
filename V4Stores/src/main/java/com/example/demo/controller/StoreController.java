package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Store;

@RestController
@RequestMapping("/api")
public class StoreController {

	@Autowired
	private StoreService stroreService;

	@GetMapping("/store")
	public List<Store> getAllStrore() {
		return stroreService.getAllStore();
	}

	@GetMapping("/store/{StorepermitionId}")
	public Store getStore(@PathVariable("StorepermitionId") int StorepermitionId) {
		return stroreService.getStoreBystorepermitionId(StorepermitionId);
	}

	@DeleteMapping("/store/{StorepermitionId}")
	public void deleteStore(@PathVariable("StorepermitionId") int StorepermitionId) {
		stroreService.delete(StorepermitionId);
	}

	@PostMapping("/store")
	public String saveStore(@RequestBody Store store) {
		stroreService.saveOrUpdate(store);
		return "Done";
	}

	@PutMapping("/store")
	public Store update(@RequestBody Store store) {
		stroreService.saveOrUpdate(store);
		return store;
	}

}
