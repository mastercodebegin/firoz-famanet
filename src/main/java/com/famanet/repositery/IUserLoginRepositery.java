package com.famanet.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.famanet.model.UserLogin;
@Repository
public interface IUserLoginRepositery extends JpaRepository<UserLogin, Integer> {

}
