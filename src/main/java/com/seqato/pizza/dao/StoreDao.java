package com.seqato.pizza.dao;

import java.util.List;


import com.seqato.pizza.model.Store;

public interface StoreDao {
	
Store findByStoreId(int id);	
void saveStore(Store store);	
List<Store>findStore();
void deleteStoreById(int id);

}
