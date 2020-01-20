package com.famanet.helper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

@Component
public class JwtHelper {
	
	public final static String secret_key = "famanet"; 
	public final static String issuer = "famanet"; 
	public final static Algorithm algorithm= Algorithm.HMAC256(secret_key);
	public  static final  int expiredtimeduration = 1500;
	
	private static class LazyHolder
	{
		final static JwtHelper INSTANCE= new JwtHelper();
	}	
		public static JwtHelper getInstanse()
		{
			return LazyHolder.INSTANCE;
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

public static DecodedJWT verifyToken(String jwt)
{
	JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
	DecodedJWT jwttoken = verifier.verify(jwt);
	return jwttoken;
	
}

public static void verifyRequestedToken(String jwttoken)
{
	 JwtHelper.getInstanse().verifyToken(jwttoken);
}
public String getemail(String jwttokn)
{
	return JwtHelper.getInstanse().verifyToken(jwttokn).getClaim("email").asString();
}
}