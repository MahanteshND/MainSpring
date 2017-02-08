package com.ami.org.model.dao.ForgetDAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ami.org.Dto.ForgetDto.ForgetDto;
import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.util.Constructor;

@Repository
public class ForgetDAO {
	@Autowired
	private SessionFactory factory;

	public ForgetDAO() {
		Constructor.message(getClass());
	}

	public RegistrationDto getdao(ForgetDto dto) {
		System.out.println("inside  forget dao ");
		Session session = factory.openSession();
		String qry = "from RegistrationDto d where d.email=:email";
		Query query = session.createQuery(qry);
		query.setParameter("email", dto.getEmail());
		RegistrationDto dtofromdb = (RegistrationDto) query.uniqueResult();
		System.out.println("inside Forgot DAO");
		return dtofromdb;

	}
}
