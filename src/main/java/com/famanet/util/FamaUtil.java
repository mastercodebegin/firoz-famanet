package com.famanet.util;

import java.security.SecureRandom;

public class FamaUtil {
	
	private static final String GENERATE_STR = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static SecureRandom random= new SecureRandom();
	
	public static String getPassword(int len)
	{
	StringBuilder str = new StringBuilder(len);
	for(int i=0;i<len;i++)
	{
		str.append(GENERATE_STR.charAt(random.nextInt(GENERATE_STR.length())));
	}
	return str.toString();
	}
}
