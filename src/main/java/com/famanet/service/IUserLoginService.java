package com.famanet.service;

import org.springframework.stereotype.Component;

import com.famanet.baseservice.IBaseService;
import com.famanet.model.User;
import com.famanet.model.UserLogin;


public interface IUserLoginService extends IBaseService<UserLogin>{

	public UserLogin createLoginDetaiils(User user); 
}
