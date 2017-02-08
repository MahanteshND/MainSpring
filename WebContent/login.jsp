<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

body{
background-image: url(bb.jpg);

}

</style>

</head>
<body>

<form action="login.do" method="post" >
<center>
<h1><font color="white"> WELCOME </font></h1>
<font color="white">Username:</font><input type="text" name="username" id="nm"/><br></br>
<font color="white">Password:</font><input type="password" name="password" id="pw"/><br></br>
<input type="submit" value="LOGIN" id="login" >
<a href="Registration.jsp"><font color="yellow">SIGN UP</font></a>
<a href="Forgetpassword.jsp"><font color="orange">Forget password</font></a>
</center>
</form>
<center><h1>${msg}</h1></center>
</body>
</html>