<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>admin</title>
</head>
	<body>
		<form method="post" action="">
		    <table>
			    <tr>
			        <td><form:label path="person.nom" > LOGIN :</form:label></td>
			        <td><form:input path="person.nom" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="person.pass">PASS :</form:label></td>
			        <td><form:input path="person.pass" /></td>
			    </tr>
			    <tr>
			        <td colspan="2">
			            <input type="submit" value="valider"/>
			        </td>
			    </tr>
			</table> 
	</form>
	</body>
</html>