package com.seqato.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.seqato.pizza.dao.ListDao;
import com.seqato.pizza.model.Item;

@Service("listService")
@Transactional
public class ListServiceImpl implements ListService{
	
	@Autowired
	private ListDao dao;
	public void addItem(Item item){
		dao.addItem(item);
		
	}

	public List<Item> findAllItems() {
		return dao.findAllItems();
	}

	@Override
	public void deleteItem(String id) {
		
		dao.deleteItem(id);
	}

	@Override
	public Item findItembyId(int id) {
		return dao.findItembyId(id);
		
	}

	@Override
	public void updateItem(Item item) {
		Item entity=dao.findItembyId(item.getId());
		if(entity!=null){
			entity.setName(item.getName());
			entity.setPrice(item.getPrice());
			entity.setDescription(item.getDescription());
			entity.setType(item.getType());
		}
		
	}

}
