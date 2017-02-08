package com.ami.org.model.dao.updatedao;


//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.util.Constructor;
@Repository
public class Updatedao {
	@Autowired
	private SessionFactory factory;
	public Updatedao() {
		Constructor.message(getClass()); 
	}

	public RegistrationDto update(RegistrationDto dto)
	{

		System.out.println("starting updating dao...");
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		RegistrationDto dtofromdb=(RegistrationDto)session.merge(dto);
		System.out.println("saving data ");
		tx.commit();
		session.close();
		System.out.println("exitng update dao");
		return dtofromdb;
	}


}	
