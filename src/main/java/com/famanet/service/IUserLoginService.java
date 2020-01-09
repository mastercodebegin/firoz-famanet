package com.famanet.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.springframework.stereotype.Component;

import com.famanet.baseservice.IBaseService;
import com.famanet.exception.ApplicationException;
import com.famanet.model.User;
import com.famanet.model.UserLogin;


public interface IUserLoginService extends IBaseService<UserLogin>{

	public UserLogin createLoginDetaiils(User user); 
	public String login(UserLogin userLogin,HttpServletRequest request,HttpResponse response) throws ApplicationException;
	public UserLogin findByEmail(String email);
}
