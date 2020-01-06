package com.famanet.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.famanet.adapter.IUserLoginAdapter;
import com.famanet.helper.EncryptionHelper;
import com.famanet.model.User;
import com.famanet.model.UserLogin;
import com.famanet.repositery.IUserLoginRepositery;
import com.famanet.service.IUserLoginService;
import com.famanet.service.IUserService;
import com.famanet.util.FamaUtil;


@Service
public class UserLoginServiceimpl implements IUserLoginService {
	 
@Autowired
IUserLoginAdapter iUserLoginAdapter;
@Autowired
IUserLoginRepositery iUserLoginRepositery;
@Autowired
IUserService IUserService;
@Autowired
EncryptionHelper Helper;
public UserLogin create(UserLogin entity) {
		// TODO Auto-generated method stub
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

	@Override
	public UserLogin createLoginDetaiils(User user) {
		UserLogin userLogin=new UserLogin();
		userLogin.setUsername(user.getEmail());
		String randompswd = FamaUtil.getPassword(8);
		System.out.println(randompswd);
		String encryptpswd=Helper.encodePassword(randompswd);
		System.out.println(randompswd);
		userLogin.setUser(user);
		userLogin.setPassword(encryptpswd);
		UserLogin createdUser = create(userLogin);
		//iUserLoginRepositery.save(userLogin);
		return createdUser;
	}

}
