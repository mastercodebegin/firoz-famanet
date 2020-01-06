package com.famanet.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.famanet.adapter.IUserAdapter;
import com.famanet.model.User;
import com.famanet.repositery.IUserRepositery;

@Component
public class Userimpl implements IUserAdapter {
@Autowired
IUserRepositery iUserRepositery;

public User create(User entity) {
	iUserRepositery.save(entity);
	return null;
}

public User update(User entity) {
	// TODO Auto-generated method stub
	return null;
}

public User delete(User entity) {
	// TODO Auto-generated method stub
	return null;
}

public User findAll(User entity) {
	// TODO Auto-generated method stub
	return null;
}

}
