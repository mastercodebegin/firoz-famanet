package com.famanet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.famanet.adapter.impl.DepartmentAdapter;
import com.famanet.model.Department;
import com.famanet.service.IDepartmentService;

@Service
public class DepartmentServiceimpl implements IDepartmentService {
@Autowired
DepartmentAdapter departmentAdapter;
	@Override
	public Department create(Department entity) {
		return departmentAdapter.create(entity);
	}

	@Override
	public Department update(Department entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department delete(Department entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department findAll(Department entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
