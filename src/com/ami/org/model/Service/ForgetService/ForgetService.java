package com.ami.org.model.Service.ForgetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ami.org.Dto.ForgetDto.ForgetDto;
import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.model.dao.ForgetDAO.ForgetDAO;
import com.ami.org.util.Constructor;

@Component
public class ForgetService {
	@Autowired
	private ForgetDAO forgetdao;

	public ForgetService() {
		Constructor.message(getClass());
	}

	public RegistrationDto forgetservice(ForgetDto dto) {
		System.out.println("inside forget service ");
		RegistrationDto dtofromdb = forgetdao.getdao(dto);
		System.out.println("exiting forget service");
		return dtofromdb;
	}
}
