<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<form method="post" action="display">
		    <table>
			    <tr>
			        <td><form:label path="person.nom" > nom :</form:label></td>
			        <td><form:input path="person.nom" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="person.prenom">prenom :</form:label></td>
			        <td><form:input path="person.prenom" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="person.age">age :</form:label></td>
			        <td><form:input path="person.age" /></td>
			    </tr>
			    <tr>
                         <td>
                                 <ul>
                                         <form:select path="person.pays" >
                                                 <form:option value="-" label="--Selectionner Votre pays"/>
                                 		<form:options items="${paysMap}" />
                                         </form:select>
                                 </ul>
                         </td>
    </tr>
                <tr>
			        <td><form:label path="person.sport.name">Sport :</form:label></td>
			        <td><form:input path="person.sport.name" /></td>
			    </tr>
			     <tr>
			        <td><form:label path="person.sport.club">Club :</form:label></td>
			        <td><form:input path="person.sport.club" /></td>
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