package com.famanet.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.famanet.adapter.impl.UserLoginAdapter;
import com.famanet.exception.ApplicationException;
import com.famanet.helper.EncryptionHelper;
import com.famanet.helper.JwtHelper;
import com.famanet.model.User;
import com.famanet.model.UserLogin;
import com.famanet.repositery.IUserLoginRepositery;
import com.famanet.service.IUserLoginService;
import com.famanet.service.IUserService;
import com.famanet.util.FamaUtil;


@Service
public class UserLoginServiceimpl implements IUserLoginService {
	
	@Autowired
	IUserLoginService iUserLoginService;
	
@Autowired
UserLoginAdapter iUserLoginAdapter;
@Autowired
IUserLoginRepositery iUserLoginRepositery;
@Autowired
IUserService IUserService;
@Autowired
EncryptionHelper encryptionHelper;
@Autowired 
JwtHelper jwtHelper;

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
		userLogin.setPassword(encryptpswd);
		//System.out.println(encryptpswd);
		userLogin.setUser(user);
		
		UserLogin createdUser = create(userLogin);
				//iUserLoginRepositery.save(userLogin);
		return createdUser;
	}
	@Override
	public UserLogin findByEmail(String email) {
		return iUserLoginRepositery.findByUsername(email);
		
	}

	@Override
	public String login(UserLogin userLogin, HttpServletRequest request, HttpResponse response) throws ApplicationException {
	String email = userLogin.getUsername();
	UserLogin login = iUserLoginService.findByEmail(email);
	if(login!=null)
	{
	
	System.out.println("Got an Email");
	}
	else
		System.out.println("Did not get any record");
	if(!encryptionHelper.checkPassword(userLogin.getPassword(), login.getPassword()))
	{
		
		throw new ApplicationException("****Enter correct Password******  " + userLogin.getPassword() +" "+ login.getPassword());
	}
	String token = jwtHelper.createJwtToken(login.getUsername(), login.getId());
	return token;
	}

	

}
