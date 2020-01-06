package com.famanet.service;

import com.famanet.baseservice.IBaseService;
import com.famanet.model.User;
import com.famanet.model.UserLogin;

public interface IUserLoginService extends IBaseService<UserLogin>{

	public User createLoginDetaiils(User user); 
}
