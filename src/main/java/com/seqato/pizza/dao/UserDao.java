package com.seqato.pizza.dao;


import com.seqato.pizza.model.User;

public interface UserDao  {
	
	public void saveUser(User user);

	public boolean checkMail(String email);
	
	public boolean checkUser(String email,String password);
	
	public String fetchUser(String email, String password);
}
