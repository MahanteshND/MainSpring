package com.ami.org.model.dao.countrydao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ami.org.Dto.CountryDto.CountrydDTO;
import com.ami.org.util.Constructor;
@Repository
public class CountryDAO {
	@Autowired
	private SessionFactory factory;
	
	public CountryDAO() {
Constructor.message(getClass());
	}
 public void Countrysave(CountrydDTO dto)
 {
	 System.out.println("inside County dao");
	 Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	 session.save(dto);
	 tx.commit();
	 session.close();
	 
	 System.out.println("exiting Country dao");
 }
}
