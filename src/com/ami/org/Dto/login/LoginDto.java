package com.ami.org.Dto.login;

import java.io.Serializable;

import com.ami.org.util.Constructor;

public class LoginDto implements Serializable {
	public LoginDto(){
		Constructor.message(this.getClass());
	}
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
