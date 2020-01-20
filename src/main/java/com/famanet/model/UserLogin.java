package com.famanet.model;

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
	private int id;
	private String username;
	private String password;
	@OneToOne
	@JoinColumn(name="user_id")
	@JsonIgnore
	private User user;
	
}
