package com.famanet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.famanet.adapter.impl.RolesAdapter;
import com.famanet.model.Roles;
import com.famanet.service.IRolesService;

@Service
public class RolesServiceimpl implements IRolesService{
@Autowired
RolesAdapter rolesAdapter;
	@Override
	public Roles create(Roles entity) {
		return rolesAdapter.create(entity);
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
