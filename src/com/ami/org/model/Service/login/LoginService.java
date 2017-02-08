 package com.ami.org.model.Service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.Dto.login.LoginDto;
import com.ami.org.model.dao.login.LoginDao;
import com.ami.org.util.Constructor;

@Service
public class LoginService {
	@Autowired
	private LoginDao dao;

	public LoginService() {
		Constructor.message(getClass());
	}

	public RegistrationDto loginService(LoginDto dto) {
		System.out.println("inside login Service");

		RegistrationDto dtofromdb = dao.getDTO(dto);
		System.out.println("existing login service");
		return dtofromdb;
	}
	
}
