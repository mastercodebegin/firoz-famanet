package com.famanet.basecontroller;

import org.springframework.beans.factory.annotation.Autowired;

import com.famanet.helper.JwtHelper;
import com.famanet.model.UserLogin;
import com.famanet.service.IUserLoginService;

public class BaseController {
	@Autowired
	IUserLoginService userLoginService;

	
	
	  public UserLogin getAuthorized(String token) 
	  {
		  return getDataByEmail(token); 
	}
	 
	public UserLogin getDataByEmail(String token)
	{
		System.out.println(getEmailByJson(token));
		return userLoginService.findByEmail(getEmailByJson(token));
		//return null;
	}
	
	public String getEmailByJson(String token)
	{
		return JwtHelper.getInstanse().getemail(token);
		//System.out.println(token);
		
	}
}
