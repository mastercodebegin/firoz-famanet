package com.famanet.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.famanet.enums.JobStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user_details")
@Getter@Setter
public class User {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="firstname")
	private String firstname;
	
	/*
	 * @Column(name="lastname") private String lastname;
	 * 
	 * @Column(name="fathername") private String fathername;
	 * 
	 * @Column(name="maritalstatus") private String maritalstatus;
	 * 
	 * @Column(name="spousename") private String spousename;
	 * 
	 * @Column(name="mobile") private String mobile;
	 */ 
	  @Column(name="personal_email") private String personal_email;
	 /* 
	 * @Column(name="official_email") private String official_email;
	 * 
	 * @Column(name="date") private String dob;
	 * 
	 * @Column(name="gender") private String gender;
	 * 
	 */	
	@Column(name="uinque_id")
	 private String uinque_id;
	
	/*
	 * @Column(name="joining_date") private Date joining_date;
	 * 
	 * @Column(name="leaving_date") private Date leaving_date;
	 * 
	 * @Column(name="job_status")
	 * 
	 * @Enumerated(EnumType.STRING) private JobStatus job_status;
	 * 
	 * @Column(name="designation") private String designation;
	 * 
	 * @Column(name="experience_months") private String experience_months;
	 * 
	 * @Column(name="is_reporting_person") private String is_reporting_person;
	 */	
	//Mappings
	@ManyToOne
	private Department department;
	
	@ManyToMany
	@JoinTable(name="User_Role",
	joinColumns        = @JoinColumn(name="user_id",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="Role_id",referencedColumnName = "role_id")
	)
	private List <Roles> roles;
}
