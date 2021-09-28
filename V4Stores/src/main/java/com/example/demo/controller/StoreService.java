package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Store;

@Service
public class StoreService {

	@Autowired
	private StoreRepository storeRepository;

	public List<Store> getAllStore() {

		List<Store> store = new ArrayList<Store>();
		storeRepository.findAll().forEach(store1 -> store.add(store1));
		return store;
	}

	public Store getStoreBystorepermitionId(int id) {
		Optional<Store> data = storeRepository.findById(id);

		if (data.isPresent()) {

			return data.get();
		}

		return null;

	}

	public void saveOrUpdate(Store store) {
//		storeRepository.saveStore(store.getIcon(), null, store.getPermissionDescription(), store.getPermissionGroup(),
//				store.getPermissionLevel(), store.getPermissionName(), store.getPermissionControl(), store.getRankData(),null);

		storeRepository.saveStore(store.getPermissionName(), store.getPermissionDescription(),
				store.getPermissionGroup(), store.getPermissionControl(), store.getIcon(), store.getPermissionLevel(),
				store.getRankData(),null,null);
	}

	public void delete(int permitionId) {
		storeRepository.deleteById(permitionId);
	}

	public void update(Store store, int permitionId) {
		storeRepository.save(store);
	}

}
