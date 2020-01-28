package com.famanet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="roles")
@Setter
@Getter
public class Roles {
	
	@Id
	@GeneratedValue
	@Column(name="role_id")
	private int role_id;
	
	@Column(name="role_name")
	private String role_name;

}
