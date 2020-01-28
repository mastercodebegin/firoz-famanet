package com.famanet.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.famanet.adapter.IRoles;
import com.famanet.model.Roles;
import com.famanet.repositery.RolesRepositery;

@Component
public class RolesAdapter implements IRoles{

	@Autowired
	RolesRepositery IRolesRepositery;
	
	@Override
	public Roles create(Roles entity) {
		return IRolesRepositery.save(entity);
		 
	}

	@Override
	public Roles update(Roles entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roles delete(Roles entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roles findAll(Roles entity) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
