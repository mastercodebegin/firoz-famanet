package com.famanet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.famanet.helper.EncryptionHelper;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
public class Firoz_Famanet {

	public static void main(String[] args) {
		SpringApplication.run(Firoz_Famanet.class, args);
		
	}

}
