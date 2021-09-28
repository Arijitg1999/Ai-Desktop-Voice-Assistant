package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Store;


@Repository
public interface StoreRepository extends CrudRepository<Store, Integer> {

	
	@Modifying
	@Transactional
	@Query(value = "insert into store values (?, ?, ?, ?, ?, ?, ?, ?)" , nativeQuery = true)
	Integer saveStore(String string,String object420, String object, String object2, String object3, String object4, String object5, String object6, Integer object7);
}
