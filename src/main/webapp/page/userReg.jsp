<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>USER REGI FORM</h1>
<form action="SaveUser" Method="get" >

	<table>

		<tr>
			<td>USER FIRST NAME</td>
			<td><input type="text" name="FName"></td>
		</tr>


		<tr>
			<td>USER LAST NAME</td>
			<td><input type="text" name="LName"></td>
		</tr>


		<tr>
			<td>USER EMAIL</td>
			<td><input type="text" name="Email"></td>
		</tr>


		<tr>
			<td>USER NAME</td>
			<td><input type="text" name="Uname"></td>
		</tr>

		<tr>
			<td>USER PASSWORD</td>
			<td><input type="text" name="Password"></td>
		</tr>

<tr>
			
			<td><input type="submit" value="REGISTER"></td>
		</tr>

	</table>
</form>

</body>
</html>