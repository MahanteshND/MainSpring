 package com.ami.org.Control.RegistrationInsertControl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ami.org.Dto.Registration.RegistrationDto;
import com.ami.org.model.Service.RegistrationService.RegistrationService;
import com.ami.org.util.Constructor;
import org.springframework.mail.javamail.MimeMessageHelper;
@Controller
public class RegisterInsertControl {
	@Autowired
	private RegistrationService service;
	
	
	@Autowired
	private JavaMailSender mailsender;


 
	public RegisterInsertControl() {
		Constructor.message(this.getClass());
	}
	@RequestMapping(value="/registraion.do")
	public  ModelAndView registraionControl(@ModelAttribute RegistrationDto dto,HttpServletRequest req)
	{  
		System.out.println("inside registrion control");
		int  id=service.SaveService(dto);
		if(id>=0)
		{
			SimpleMailMessage mail=new SimpleMailMessage();
			mail.setFrom("amithubale424@gmail.com");
			mail.setTo(dto.getEmail());
			mail.setSubject("Registration Successful");
			mail.setText("Dear"+" "+dto.getFirstname()+",\n\nCongratulation your register to User application"
					+ "use below credential to login to aplication"
					+ "url\n"
					+ "login id:"+dto.getFirstname()
					+"\n"
					+ "password:"+dto.getPassword());
			
			
             mailsender.send(mail);
             
             System.out.println("mail sent");
			return  new ModelAndView("/Success.jsp");
			
		}
		else
		{
			return new ModelAndView( "/Registration.jsp");
		}


	}

}
