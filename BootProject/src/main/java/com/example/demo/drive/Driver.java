package com.example.demo.drive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Store;

public class Driver {

	
	@GetMapping("/groping")
	public static void main(String[] args) {
		List<Store> store = populateWithData();
		store.stream().collect(Collectors.groupingBy(p -> p.getPermission_group()));

//		  Map<Store, Long> result  =
//	                store.stream().collect(
//	                        Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		  System.out.println(result);
	}

	private static List<Store> populateWithData() {
		List<Store> storeList = new ArrayList<Store>();
		return storeList;
	}
}
