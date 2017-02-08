package com.ami.org.model.Service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.model.dao.InsertDao.RegistrationInsertDao;
import com.ami.org.util.Constructor;
@Service
public class RegistrationService {
	@Autowired
	private RegistrationInsertDao dao;
	public RegistrationService() {
		Constructor.message(this.getClass());
	}
	public int  SaveService(RegistrationDto dto)
	{
		System.out.println("inside register service ");
		if(dto!=null)
		{
			
		int b=dao.Registersave(dto);
			return b;

		}
		else{
			
			System.out.println("exiting from register service");
			return -1;
		}
	}
}
