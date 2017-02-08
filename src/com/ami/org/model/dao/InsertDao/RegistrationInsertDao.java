 
package com.ami.org.model.dao.InsertDao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.util.Constructor;

@Repository
public class RegistrationInsertDao {
    @Autowired
	private SessionFactory factory;
	public RegistrationInsertDao() {
		Constructor.message(this.getClass());
	}
	public int Registersave(RegistrationDto dto)
	{
		System.out.println("inserting register insert Dao");
		
		
		Session session=factory.openSession();

		Transaction tx = session.beginTransaction();

	int a=(int)session.save(dto);
		tx.commit();
		session.close();
		return a;
	}

	//System.out.println("exiting from register dao");
}

