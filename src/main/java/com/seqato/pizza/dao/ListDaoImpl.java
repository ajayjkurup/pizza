package com.seqato.pizza.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.seqato.pizza.model.Item;

@Repository("ListDao")
public class ListDaoImpl extends AbstractDao<Integer, Item> implements ListDao{
	
	public void addItem(Item item) {
		
		persist(item);
	} 
	
	public List<Item> findAllItems(){
		
		Criteria criteria = createEntityCriteria();
	
		return (List<Item>) criteria.list();
	}

	@Override
	public void deleteItem(String id) {
		Query query = getSession().createSQLQuery("delete from items where id = :id");
		query.setString("id",id);
		query.executeUpdate();
		
	}

	@Override
	public Item findItembyId(int id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("id",id));
		//criteria.add(Restrictions.allEq(propertyNameValues))
		return (Item) criteria.uniqueResult();
		
	}
	

}
