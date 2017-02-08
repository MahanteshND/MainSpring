package com.ami.org.model.Service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ami.org.Dto.CountryDto.CountrydDTO;
import com.ami.org.model.dao.countrydao.CountryDAO;
import com.ami.org.util.Constructor;
@Service
public class CountryService {
	@Autowired
	private CountryDAO dao;
	public CountryService() {
Constructor.message(getClass());
	}
	public boolean saveservice(CountrydDTO dto)
	{
		System.out.println("inside Country service");
		if(dto!=null)
		{
			dao.Countrysave(dto);
		   return true;
		}
		else
		{
			System.out.println("exitig Country Service");
              return false;
		}
		
	}

}
