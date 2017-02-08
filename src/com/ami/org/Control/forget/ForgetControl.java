package com.ami.org.Control.forget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ami.org.Dto.ForgetDto.ForgetDto;
import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.model.Service.ForgetService.ForgetService;
import com.ami.org.util.Constructor;

@Component
@RequestMapping("/")
public class ForgetControl {
	@Autowired
	private ForgetService service;

	public ForgetControl() {
		Constructor.message(this.getClass());
	}

	@RequestMapping(value = "/forgotten.do")
	public ModelAndView forgetpass(@ModelAttribute ForgetDto dto) {
		System.out.println("inside forget Controler");
		RegistrationDto dtofromdb = service.forgetservice(dto);
		if (dtofromdb != null) {
			System.out.println("inside Forgot Controller");
			return new ModelAndView("recovery.jsp", "msg", "" + dtofromdb.getPassword());
		} else {
			return new ModelAndView("Forgetpassword.jsp", "msg2", "account does not exits");
		}

	}
}
