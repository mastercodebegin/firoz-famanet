package com.famanet.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.famanet.adapter.IDepartment;
import com.famanet.model.Department;
import com.famanet.repositery.DepartmentRepositery;

@Component
public class DepartmentAdapter implements IDepartment {
@Autowired
DepartmentRepositery departmentRepositery;
	@Override
	public Department create(Department entity) {
		return departmentRepositery.save(entity);
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
