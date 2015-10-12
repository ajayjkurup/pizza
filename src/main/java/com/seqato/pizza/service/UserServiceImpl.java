package com.seqato.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seqato.pizza.dao.UserDao;
import com.seqato.pizza.model.User;

@Service("employeeService")
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao dao;
	
	public void saveUser(User user) {
		dao.saveUser(user);
	}

	@Override
	public boolean checkMail(String email) {
		 return dao.checkMail(email);
	}

	public boolean checkUser(String email,String password)
	{
		return dao.checkUser(email,password);
	}
	
	public String fetchUser(String email, String password)
	{
		return dao.fetchUser(email,password);
	}
}
