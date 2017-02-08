 package com.ami.org.Control.login;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.Dto.login.LoginDto;
import com.ami.org.model.Service.login.LoginService;
import com.ami.org.util.Constructor;

@Controller
@RequestMapping("/")
public class LoginControler {

	@Autowired
	private LoginService service;

	public LoginControler() {
		Constructor.message(this.getClass());
 	}
	@RequestMapping(value="/login.do")
	public ModelAndView loginAuthentication(@ModelAttribute LoginDto dto,HttpServletRequest req)
	{
		System.out.println("inside login controller.....");

		RegistrationDto dtoformdb=service.loginService(dto);
		
		if(dtoformdb!=null)
		{
			System.out.println("exiting controler");
			HttpSession session=req.getSession();
			session.setAttribute("dto", dtoformdb);
			return new ModelAndView("home.jsp","msg",dtoformdb.getFirstname());
		}
		else
		{
			System.out.println("existing login controller..");
			return new ModelAndView("login.jsp","msg","invalid login credentials");
		}
	}
}