package com.famanet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="department")
@Setter
@Getter
public class Department {

	@Id
	@GeneratedValue
	@Column(name="dep_id")
	private int id;
	
	@Column(name="department_name")
	private String department_name;
	
	@Column(name="discription")
	private String discription;
}
