package com.seqato.pizza.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.seqato.pizza.model.Store;

@Repository("StoreDao")
public class StoreDaoImpl extends AbstractDao<Integer, Store> implements StoreDao {
	
	@SuppressWarnings("unchecked")
	public List<Store> findStore() {
		Criteria criteria = createEntityCriteria();
		return (List<Store>) criteria.list();
	}
	
	public void saveStore(Store store) {
		persist(store);
	}
	public void deleteStoreById(int id) {
		Query query = getSession().createSQLQuery("delete from store where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}
	
	public Store findByStoreId(int id) {
		return getByKey(id);
	}
}
