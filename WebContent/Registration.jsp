<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">

body{
background-image: url(aaa.jpg);
}

</style>

</head>
<body>
 <center>
		<form action="registraion.do" method="post">
			<table>
			
				<h1>REGISTRATION PAGE</h1>


				<tr>
					<td>Firstname:</td>
					<td><input type="text" name="firstname"
					pattern="[A-Z a-z]{4,}"
						title="name should be start with uppper remain lower" required></td>
				</tr>
				<tr>
					<td>Lastname:</td>
					<td><input type="text" name="lastname" pattern="[A-Za-z]{1,}"
						title="should not empty" required></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td>male:<input type="radio" value=uncheck name="male"
						required> female:<input type="radio" value=uncheck
						name="male" required title="gender not selected"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"
						title="email formate ****@.com " required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"
						title="six or more charecters" id="user_password" required /></td>
				</tr>
				<tr>
					<td>Conform password</td>
					<td><input type="password" name="changepawd"
						id="user_password_confirm" onchange="javascript:validatepww()"
						title="password and conform password must same" required /></td>
				</tr>
				<tr>
					<td><input type="submit" class="button" value="submit"></td>
				</tr>
				<script type="text/javascript" language="javascript">
					function validatepww() {
						var password = document.getElementById("user_password").value;
						var conformpasswd = document
								.getElementById("user_password_confirm").value;
						if (password != conformpasswd) {
							alert('Passwords did not match!');
							return false;
						}
						return true;
					}
				</script>
            <script type="text/javascript" language="javascript"> 
            body{
            	backgroumd:url("D:\New folder (2)\aaa.jpg")
            }
             </script>
			</table>
		</form>
	</center>
</body>
</html>