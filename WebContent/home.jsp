<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background-image: url(img/wooden.jpg);
background-repeat: no-repeat;

}

a{
text-decoration: none;
color:blue;
background-color:pink;
padding:10px 20px;
}
</style>
</head>
<body>
<form>

<center><h1>WELCOME  ${msg}</h1>
<a href="update.jsp">UPDATE USER DETAILS</a><br></br><br></br>

<br></br>
<br>
<a href="logout.jsp">LOGOUT &nbsp;</a>
<a href="Country.jsp">ADD COUNTRY</a>
<a href="FileUpload.jsp">Upload File</a>
<br></br>
<br></br>

<a href="login.jsp">BACK</a>
</center>


</form>
</body>
</html>