package com.famanet.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.famanet.adapter.IUserLogin;
import com.famanet.model.User;
import com.famanet.model.UserLogin;
import com.famanet.repositery.IUserLoginRepositery;
@Component
public class UserLoginAdapter implements IUserLogin {

	@Autowired
	IUserLoginRepositery iUserLoginRepositery;
	
	public UserLogin createLoginDetails(User entity) {
		return null;
	}

	public UserLogin update(UserLogin entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserLogin delete(UserLogin entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserLogin findAll(UserLogin entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserLogin create(UserLogin entity) {
		iUserLoginRepositery.save(entity);
		return null;
	}

	
	

}
