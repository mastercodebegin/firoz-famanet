package com.famanet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.famanet.model.User;
import com.famanet.service.IUserLoginService;
import com.famanet.service.IUserService;

@RestController
@ComponentScan
public class UserController {
@Autowired
IUserService iUserService;
@Autowired
IUserLoginService iUserLoginService;

@PostMapping("/create")
	public String create(@RequestBody User user)
	{
		iUserService.create(user);
		return "UserCreated";
		
	}
}
