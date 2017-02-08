<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

body{
background-image: url(img/up.jpg);
}
a{
text-decoration: none;

}
</style>

</head>
<body>
<form action="update.do" method="post" enctype="application/x-www-form-urlencoded">
<center>
<h1>UPDATE USER DETAILS</h1>
<table>
<tr><td>Firstname:</td><td><input type="text" name="firstname" value="${dto.firstname}" id="name"/></td></tr>
<tr><td>Lastname:</td><td><input type="text" name="lastname" value="${dto.lastname}" id="lastname"></td></tr>
<tr><td>Gender:</td><td>male:<input type="radio" name="gender" value="male"  value="${dto.male}" id="male">
female:<input type="radio"  name="gender"  value="female" value="${dto.female}"id="female"></td></tr>
<input type="hidden" name="email" value="${dto.email}" id="email"/>
<tr><td>Password</td><td><input type="password" name="password" value="${dto.password}" id="password"></td></tr>
<tr><td>Conform password</td><td><input type="password" name="changepawd"  value="${dto.changepawd}"id="changepawd"></td></tr>
</table>
<br></br>
<input type="submit" value="submit"> 
<br>
<br>
<br>
<a href="home.jsp">BACK</a>
</center>

</form>
</body>
</html>

