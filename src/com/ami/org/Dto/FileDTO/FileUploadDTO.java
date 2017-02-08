package com.ami.org.Dto.FileDTO;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
import javax.servlet.ServletContext;

import org.hibernate.annotations.GenericGenerator;

import com.ami.org.util.Constructor;
	@Entity
	@Table(name="file_table")
	public class FileUploadDTO implements Serializable {
	//	private FileUploadDAO dao;
	    @Id
	    @GenericGenerator(name="myid",strategy="increment")
	    @GeneratedValue(generator="myid")
	    private int id;
	    @Column(name="t_file")
		private String file;
	    
	  public FileUploadDTO() {
     Constructor.message(getClass());
	  
	  }
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public byte[] getBytes() {
		// TODO Auto-generated method stub
		return null;
	}
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return null;
	}  
     
}

