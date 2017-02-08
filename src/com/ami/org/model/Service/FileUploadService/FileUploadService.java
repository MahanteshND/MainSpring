 package com.ami.org.model.Service.FileUploadService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ami.org.Dto.FileDTO.FileUploadDTO;
import com.ami.org.model.dao.FileUploadDAO.FileUploadDAO;
import com.ami.org.util.Constructor;

	
		
@Service
public class FileUploadService {
@Autowired
private FileUploadDAO dao;
public FileUploadService() {
Constructor.message(getClass());
}
public boolean saveservice(FileUploadDTO dto) throws IOException
{
	System.out.println("inside file upload service");
	if(dto!=null)
	{
		dao.saveimage(dto);
	   return true;
	}
	else
	{
		System.out.println("exitig fileupload Service");
          return false;
	}
	
}

}
