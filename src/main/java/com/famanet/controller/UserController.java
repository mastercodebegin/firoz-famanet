package com.famanet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.famanet.basecontroller.BaseController;
import com.famanet.model.User;
import com.famanet.model.UserLogin;
import com.famanet.service.IUserLoginService;
import com.famanet.service.IUserService;

@RestController

public class UserController extends BaseController {
@Autowired
IUserService iUserService;
@Autowired
IUserLoginService iUserLoginService;

@PostMapping("/create")
	public String create( @RequestHeader(name="JwtToken" , required = true) String token,@RequestBody User user)
	{
	UserLogin login = getAuthorized(token);
	System.out.println("Verified Token");
		iUserService.create(user);
		return "UserCreated";
	
	
	
		
			
	}
}
