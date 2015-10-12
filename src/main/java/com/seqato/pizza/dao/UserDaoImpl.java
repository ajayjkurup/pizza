package com.seqato.pizza.dao;



import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.seqato.pizza.model.User;



@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao{
	
	private static final String NULL = null;

	public void saveUser(User user) {
		persist(user);
	}

	@Override
	public boolean checkMail(String emails) {
		
		Query query = getSession().createSQLQuery("select * from user where email=:email");
		  query.setParameter("email",emails);

		  List list=query.list();
		boolean valid=  list.isEmpty();
		return valid;
	}
	
	public boolean checkUser(String emails, String passwords)
	{
		Query query=getSession().createSQLQuery("select * from user where email=:email AND password=:password");
		query.setParameter("email", emails);
		query.setParameter("password", passwords);
		List  list=query.list();
		boolean valid=list.isEmpty();
		
		
		return valid;
	}

	public String fetchUser(String emails,String passwords)
	{
		
		
		Query query=getSession().createSQLQuery("select uname from user where email=:email and password=:password");
		query.setParameter("email", emails);
		query.setParameter("password", passwords);
		List list=query.list();
		
		
		return list.toString();
	}

	
}
