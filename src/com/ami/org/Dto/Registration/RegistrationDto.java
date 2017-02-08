package com.ami.org.Dto.Registration;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="user_table")
public class RegistrationDto implements Serializable{
	public RegistrationDto() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}
	@Id
	@GenericGenerator(name="myid",strategy="increment")
	@GeneratedValue(generator="myid")
	@Column(name="r_id")
	private int id;
	
	@Column(name="r_firstname")
	private String firstname;
	@Column(name="r_lastname")
	private String lastname;
	@Column(name="r_male")
	private String male;
	@Column(name="r_female")
	private String female; 
	@Column(name="r_email")
	private String email;
	@Column(name="r_password")
	private String password;
	@Column(name="r_changepawd")
	private String changepawd;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMale() {
		return male;
	}
	public void setMale(String male) {
		this.male = male;
	}
	public String getFemale() {
		return female;
	}
	public void setFemale(String female) {
		this.female = female;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getChangepawd() {
		return changepawd;
	}
	public void setChangepawd(String changepawd) {
		this.changepawd = changepawd;
	}
	public int  getid() {
		return id;
	}
	public void setId(int getid) {

		this.id=id;
	}


}
