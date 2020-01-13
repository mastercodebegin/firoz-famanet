package com.famanet.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.famanet.exception.ApplicationException;
import com.famanet.model.UserLogin;
import com.famanet.service.IUserLoginService;

@RestController
public class UserLoginController {

	@Autowired
	IUserLoginService IUserLoginService;
	
	@PutMapping("/login")
	public String login(@RequestBody UserLogin userLogin,HttpServletRequest request,HttpResponse response) throws ApplicationException
	{
		IUserLoginService.login(userLogin, request, response);
		return /*response.toString()+request.toString();*/"User Logged In";
	}
}
