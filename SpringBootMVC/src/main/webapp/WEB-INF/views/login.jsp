<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Spring Login Form</title>
	</head>
	<body>
		<form:form name="submitForm" method="POST">
			<div align="center">
				<h1 style=color:blue>${msg}</h1> 
				<table>
					<tr>
						<th>User Name</th>
						<td><input type="text" name="userName" /></td>
					</tr>
					<tr>
						<th>Password</th>
						<td><input type="password" name="password" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Login" /></td>
					</tr>
				</table>
				<div style="color:red">${error}</div>
			</div>
		</form:form>
	</body>
</html>