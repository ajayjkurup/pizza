package com.seqato.pizza.service;

import java.util.List;

import com.seqato.pizza.model.Store;;

public interface StoreService 
{
	Store findByStoreId(int id);
	List<Store> findStore(); 	
	void saveStore(Store store);
	void updateStore(Store store);
	void deleteStoreById(int id);
}
