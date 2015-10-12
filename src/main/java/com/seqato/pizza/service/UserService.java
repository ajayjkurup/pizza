package com.seqato.pizza.service;


import com.seqato.pizza.model.User;


public interface UserService {
	
	
	void saveUser(User user);

	boolean checkMail(String email);
	
	boolean checkUser(String email, String uname);
	String fetchUser(String email,String password);
}
