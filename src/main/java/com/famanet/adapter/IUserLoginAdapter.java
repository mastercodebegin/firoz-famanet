package com.famanet.adapter;

import org.springframework.stereotype.Component;

import com.famanet.adapter.baseadapter.IBaseAdapter;
import com.famanet.model.UserLogin;

@Component
public interface IUserLoginAdapter extends IBaseAdapter<UserLogin> {

}
