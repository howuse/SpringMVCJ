<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<form:form method="POST"  commandName="hobby" action="display1">
			
			 <table>  
			 <tr>  
		        <td>Is any hobby: </td>  
		       <td><form:checkbox path="hobbyExists"></form:checkbox></td>  
		     </tr>  
		     <tr>  
		        <td colspan="2">  
		            <input value="Submit" type="submit">  
		        </td>  
		     </tr>  
			</table>  
		</form:form>
	</body>
</html>