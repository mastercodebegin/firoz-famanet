package com.famanet.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.famanet.model.Roles;

@Repository
public interface RolesRepositery extends JpaRepository<Roles, Integer> {

}
