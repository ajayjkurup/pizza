package com.seqato.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seqato.pizza.dao.StoreDao;
import com.seqato.pizza.model.Store;

@Service("storeService")
@Transactional
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreDao dao;
	
	public Store findByStoreId(int id) {
		return dao.findByStoreId(id);
	}
	
	public List<Store> findStore() {
		return dao.findStore();
	}
	public void saveStore(Store store) {
		dao.saveStore(store);
	}
	
	public void updateStore(Store store) {
		Store entity = dao.findByStoreId(store.getId());
		if(entity!=null){
			entity.setName(store.getName());
			entity.setAddress(store.getAddress());
			entity.setAdmin_id(store.getAdmin_id());
			entity.setLicense(store.getLicense());
			entity.setPhone_number(store.getPhone_number());
			entity.setId(store.getId());
		}
	}
	
	public void deleteStoreById(int id) {
		dao.deleteStoreById(id);
	}
	
}
