package com.ami.org.Dto.ForgetDto;

import com.ami.org.util.Constructor;

public class ForgetDto {
public ForgetDto() {
Constructor.message(getClass());
}
private String email;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
