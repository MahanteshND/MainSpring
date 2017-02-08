package com.ami.org.Control.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ami.org.Dto.CountryDto.CountrydDTO;
import com.ami.org.model.Service.CountryService.CountryService;
import com.ami.org.util.Constructor;
@RequestMapping("/")
@Controller
public class CountryControler {
	@Autowired
	private CountryService service;
public CountryControler() {
	Constructor.message(getClass());
}
@RequestMapping("/country.do")
public ModelAndView service(CountrydDTO dto)
{
	System.out.println("inside the Country Controler");
	boolean flag=service.saveservice(dto);
	if(flag)
	{
		return new ModelAndView("/success1.jsp");
	}
	else
	{
		return new ModelAndView("/country.jsp");
	}
	
}
}
