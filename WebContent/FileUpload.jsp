<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
 <head> 
 <head>
<style type="text/css">

body{
background-image: url(img/pj.jpg);
}

</style>

</head> 
 <title>Image File Upload</title>  
 </head>  
 <body> 
 <center>
<h1>File Upload</h1>  
 
<h3 style="color:red">${filesuccess}</h3>  
<form method="post" action="uploadfile.do" enctype="multipart/form-data">  
<p><label for="image">Choose Image</label></p>  
<p><input name="file" id="fileToUpload" type="file" /></p>  
<p><input type="submit" value="Upload"></p>  
</form>  
</center> 
</body>  
</html>  