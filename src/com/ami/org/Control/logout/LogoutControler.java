package com.ami.org.Control.logout;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ami.org.util.Constructor;
@RequestMapping("/")
@Controller
public class LogoutControler {
	public LogoutControler() {
  Constructor.message(getClass());
	}
	@RequestMapping("/logout.do")
public String logout(HttpServletRequest req)
{
	HttpSession session=req.getSession(false);
	session.invalidate();
 return "/login.jsp";
}
}
