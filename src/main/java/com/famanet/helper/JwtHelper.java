package com.famanet.helper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

@Component
public class JwtHelper {
	
	public final static String secret_key = "famanet"; 
	public final static String issuer = "famanet"; 
	public final static Algorithm algorithm= Algorithm.HMAC256(secret_key);
	public  static final  int expiredtimeduration = 1500;
	
	static class LazyHolder
	{
		final static JwtHelper INSTANCE= new JwtHelper();
		
		public static JwtHelper getInstanse()
		{
			return INSTANCE;
		}
	}
public String createJwtToken(String email,int userid)
{
 UUID uuid= UUID.randomUUID();
 LocalDateTime currentTime= LocalDateTime.now();
 LocalDateTime expiredTime = currentTime.plusMinutes(expiredtimeduration);
 Date issuedDate = Date.from(currentTime.atZone(ZoneId.systemDefault()).toInstant());
 Date expiredDate = Date.from(expiredTime.atZone(ZoneId.systemDefault()).toInstant());
 
 String token = JWT.create().withIssuer(issuer).
		         withIssuedAt(issuedDate).
		         withClaim("email",email).
		         withClaim("userid",userid).
		         withJWTId(uuid.toString()).
		         sign(algorithm);       
return token;
}

public DecodedJWT decodeJwt()
{
	
	return null;
}
}