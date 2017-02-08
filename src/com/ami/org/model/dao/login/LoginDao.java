package com.ami.org.model.dao.login;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.Dto.login.LoginDto;
import com.ami.org.util.Constructor;


@Component
public class LoginDao { 
	@Autowired
	private SessionFactory factory;

	public LoginDao() {
		Constructor.message(getClass());
	}

	public RegistrationDto getDTO(LoginDto dto)
	{
		System.out.println("inside dao");
		System.out.println(dto.getUsername());
		System.out.println(dto.getPassword());
		String hql="from RegistrationDto where firstname=:nm and password=:pw";
		Session session = factory.openSession();
      Query query= session.createQuery(hql);
      query.setParameter("nm",dto.getUsername());
       query.setParameter("pw",dto.getPassword());
       
      RegistrationDto  dtofromdb=(RegistrationDto) query.uniqueResult();
      
		System.out.println("exiting dao....");
	return dtofromdb;
	}
}
