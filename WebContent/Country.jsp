<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

body{
background-image: url(img/gh.jpg);
}

</style>

</head>
<body>
<form  action="country.do" method="post">
<center>
<h1>COUNTRY DETAILS</h1>
<table>
<tr><td>Country name:</td><td><input type="text" name="countryname"/></td></tr>
<tr><td>Country code:</td><td><input type="text" name="countrycode"/></td></tr>
<tr><td>Country Capital:</td><td><input type="text" name="capital"/></td></tr>
<tr><td></td><td><input type="submit" value="SUBMIT"></td></tr>
</table>
</center>
</form>
</body>
</html>