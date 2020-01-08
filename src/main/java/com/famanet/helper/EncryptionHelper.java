package com.famanet.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Configuration
public class EncryptionHelper {

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	
	  @Bean 
	   public BCryptPasswordEncoder getbCryptPasswordEncoder() {
		 if(bCryptPasswordEncoder==null) { 
			 System.out.println("Hi");
		  bCryptPasswordEncoder  = new BCryptPasswordEncoder();
		  System.out.println("Hi");
		 }  return bCryptPasswordEncoder; }
	 
	public String encodePassword(String pswd) {
		 bCryptPasswordEncoder = getbCryptPasswordEncoder();
		return  bCryptPasswordEncoder.encode(pswd);
	}
	

}
