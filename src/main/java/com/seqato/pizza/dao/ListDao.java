package com.seqato.pizza.dao;

import java.util.List;

import com.seqato.pizza.model.Item;

public interface ListDao {
	public void addItem(Item item);
	public List<Item> findAllItems();
	public void deleteItem(String id);
	public Item findItembyId(int id);

}
