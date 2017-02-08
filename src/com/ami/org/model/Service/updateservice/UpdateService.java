package com.ami.org.model.Service.updateservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.model.dao.updatedao.Updatedao;
import com.ami.org.util.Constructor;

@Service
public class UpdateService {
     @Autowired
	private Updatedao dao;
public UpdateService() {
Constructor.message(this.getClass());
} 
public RegistrationDto updateDetailsService(RegistrationDto dto)
{
System.out.println("starting update service");
RegistrationDto dtofromdb=dao.update(dto);
System.out.println("exiting update service");

return dtofromdb;
}
}

