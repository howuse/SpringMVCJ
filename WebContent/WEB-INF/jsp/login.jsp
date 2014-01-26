<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;  charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>vos informations </h2>
   <table>
    <tr>
        <td>Nom :</td>
        <td>${nom}</td>
    </tr>
    <tr>
        <td>Prenom :</td>
        <td>${prenom}</td>
    </tr>
    
   
</table>  
</body>

</html>