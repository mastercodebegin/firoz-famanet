package com.famanet.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.famanet.model.Department;

@Repository
public interface DepartmentRepositery extends JpaRepository<Department,Integer> {

}
