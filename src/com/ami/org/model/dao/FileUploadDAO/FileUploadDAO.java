package com.ami.org.model.dao.FileUploadDAO;

import java.io.BufferedOutputStream;  
import java.io.File;  
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;  
//import org.apache.commons.fileupload.servlet.ServletFileUpload;  
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.multipart.commons.CommonsMultipartFile;  
import org.springframework.web.servlet.ModelAndView;

import com.ami.org.Dto.FileDTO.FileUploadDTO;  

@Repository
public class FileUploadDAO { 
	@Autowired
	private SessionFactory factory;
	
	
	
//	private static final String UPLOAD_DIRECTORY ="/images";  

	//@RequestMapping("/savefile.do")  
	//public ModelAndView uploadForm(){  
	//	return new ModelAndView("uploadform");    
	//}  
	//@RequestMapping(value="savefile",method=RequestMethod.POST)  
	public void saveimage(FileUploadDTO dto) throws IOException{  

		ServletContext context = dto.getServletContext();  
		System.out.println(UPLOAD_DIRECTORY);
		System.out.println(context);
		String path = context.getRealPath(UPLOAD_DIRECTORY);  
		String filename = dto.getFile();  
		System.out.println(path+" "+filename);        

		byte[] bytes = dto.getBytes();  
		BufferedOutputStream stream = null;
		try {
		stream = new BufferedOutputStream(new FileOutputStream(new File(path + File.separator + filename)));
		} catch (Exception e) {
		 TODO Auto-generated catch block
		e.printStackTrace();
	}  
	stream.write(bytes);  
	stream.flush();  
		stream.close();
	return null;  
		System.out.println(" inside file upload  Dao");
		
		
		Session session=factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);
		tx.commit();
		session.close();
	}  
}  


