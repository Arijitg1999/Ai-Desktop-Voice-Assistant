package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StroreDAo;
import com.example.demo.model.Store;

@Service
public class ServiceStore {

	@Autowired
	private StroreDAo dao;

	public List<Store> getAllStore() {

		List<Store> store = new ArrayList<Store>();
		dao.findAll().forEach(store1 -> store.add(store1));
		return store;
	}

	public Store getStoreBypermissionId(Integer id) {
		Optional<Store> data = dao.findById(id);

		if (data.isPresent()) {

			return data.get();
		}

		return null;

	}

	public void save(Store store) {
		dao.save(store);

	}

	public void delete(Integer permissionId) {
		dao.deleteById(permissionId);
	}

	public Store updateProduct(Store store) {
		Store existingProduct = dao.findById(store.getPermissionId()).orElse(null);
		existingProduct.setPermissionName(store.getPermissionName());
		existingProduct.setPermission_description(store.getPermission_description());
		existingProduct.setPermission_group(store.getPermission_group());
		existingProduct.setPermission_control(store.getPermission_control());
		existingProduct.setIcon(store.getIcon());
		existingProduct.setPermission_level(store.getPermission_level());
		existingProduct.setRank_data(store.getRank_data());
		return dao.save(existingProduct);

	}

	public static void main(String[] args) {
		List<Store> store = populateWithData();

		store.stream().collect(Collectors.groupingBy(p -> p.getPermission_group()));
	}

//	public static List<Store> populateWithData() {
		public Store getStoreByPermission_group(String group) {
//		List<Store> storeList = new ArrayList<Store>();
			Optional<Store> data = dao..findBygroup(group);
		return storeList;		
	}
}