package com.famanet.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.famanet.model.User;
@Repository
public interface IUserRepositery extends JpaRepository<User,Integer> {

}
