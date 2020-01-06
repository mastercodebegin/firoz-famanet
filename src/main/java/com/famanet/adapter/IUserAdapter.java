package com.famanet.adapter;

import org.springframework.stereotype.Component;

import com.famanet.adapter.baseadapter.IBaseAdapter;
import com.famanet.model.User;

@Component
public interface IUserAdapter extends IBaseAdapter<User> {

}
