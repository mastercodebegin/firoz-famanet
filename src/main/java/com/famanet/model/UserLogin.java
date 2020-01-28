package com.famanet.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserLogin {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@JsonIgnore
	@Column(name="activation_link")
	private String activation_link;
	
	@JsonIgnore
	@Column(name="password_expiry_date")
	private Date password_expiry_date;
	
	@JsonIgnore
	@OneToOne
	private User user;
		
}
