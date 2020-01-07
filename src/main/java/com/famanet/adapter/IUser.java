package com.famanet.adapter;

import org.springframework.stereotype.Component;

import com.famanet.adapter.baseadapter.IBaseAdapter;
import com.famanet.model.User;

@Component
public interface IUser extends IBaseAdapter<User> {

}
