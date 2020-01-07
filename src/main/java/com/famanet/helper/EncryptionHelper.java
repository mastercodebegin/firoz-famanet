package com.famanet.helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class EncryptionHelper {
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder ;
	
	@Bean
	public BCryptPasswordEncoder getbCryptPasswordEncoder()
	{
		if(bCryptPasswordEncoder==null)
		{
			 bCryptPasswordEncoder = new BCryptPasswordEncoder();
			
		}
		return bCryptPasswordEncoder;
	}
	
	public String encodePassword(String pswd)
	{   bCryptPasswordEncoder=getbCryptPasswordEncoder();
		bCryptPasswordEncoder.encode(pswd);
		return pswd;
	}

}
