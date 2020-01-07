package com.famanet.adapter;

import org.springframework.stereotype.Component;

import com.famanet.adapter.baseadapter.IBaseAdapter;
import com.famanet.model.User;
import com.famanet.model.UserLogin;

@Component
public interface IUserLogin extends IBaseAdapter<UserLogin> {
	public UserLogin createLoginDetails(User entity);
}
