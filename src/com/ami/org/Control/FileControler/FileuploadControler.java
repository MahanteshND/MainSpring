package com.ami.org.Control.FileControler;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ami.org.Dto.FileDTO.FileUploadDTO;
import com.ami.org.model.Service.FileUploadService.FileUploadService;
import com.ami.org.util.Constructor;

@RequestMapping("/")
@Controller
public class FileuploadControler {
	
	@Autowired
private FileUploadService service;
	public FileuploadControler() {
Constructor.message(getClass());
	}
	@RequestMapping("/uploadfile.do")
	public ModelAndView fileuploadservice(@ModelAttribute FileUploadDTO dto) throws IOException{
		System.out.println("inside the Country Controler");
		System.out.println(dto);
		boolean flag=service.saveservice(dto);
		if(flag)
		{
			return new ModelAndView("/success1.jsp");
		}
		else
		{
			return new ModelAndView("/FileUpload.jsp");
		}
		
	}

}

