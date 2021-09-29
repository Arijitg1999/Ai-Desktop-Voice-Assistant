package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Store;

public interface StroreDAo extends CrudRepository<Store,Integer> {

}
