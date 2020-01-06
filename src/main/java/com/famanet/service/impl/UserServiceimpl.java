package com.famanet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.famanet.adapter.IUserAdapter;
import com.famanet.helper.EncryptionHelper;
import com.famanet.model.User;
import com.famanet.service.IUserService;

@Component
public class UserServiceimpl implements IUserService {

	@Autowired
	IUserAdapter userimpl;
	@Autowired
	UserLoginServiceimpl userLoginServiceimpl;
	@Autowired
	private EncryptionHelper encryptionHelper;
	
	public User create(User entity) {
		userimpl.create(entity);
		userLoginServiceimpl.createLoginDetaiils(entity);
		return null;
	}

	public User update(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public User delete(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findAll(User entity) {
		// TODO Auto-generated method stub
		return null;
	}}