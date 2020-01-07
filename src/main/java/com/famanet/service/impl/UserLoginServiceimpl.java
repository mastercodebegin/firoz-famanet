package com.famanet.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.famanet.adapter.impl.UserLoginAdapter;
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
UserLoginAdapter iUserLoginAdapter;
@Autowired
IUserLoginRepositery iUserLoginRepositery;
@Autowired
IUserService IUserService;
@Autowired
EncryptionHelper encryptionHelper;
public UserLogin create(UserLogin entity) {
	iUserLoginAdapter.create(entity);
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
		String encryptpswd=encryptionHelper.encodePassword(randompswd);
		System.out.println(encryptpswd);
		userLogin.setUser(user);
		userLogin.setPassword(encryptionHelper.encodePassword(randompswd));
		UserLogin createdUser = create(userLogin);
		//iUserLoginRepositery.save(userLogin);
		return createdUser;
	}

}
