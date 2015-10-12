package com.seqato.pizza.service;

import java.util.List;
import com.seqato.pizza.model.Item;

public interface ListService {
	void addItem(Item item);
	List<Item> findAllItems();
	void deleteItem(String id);
	Item findItembyId(int id);
	void updateItem(Item item); 

}
