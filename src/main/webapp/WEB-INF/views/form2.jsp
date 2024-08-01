<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
<style>
	.error{
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<form:form action="/student2/form2" modelAttribute="sv" method="post">
		<form:label path="name">Name: </form:label>   <form:input path="name"/>
			<form:errors path="name" element="span" cssClass="error"></form:errors>
		
		 <br>
		 
		<form:label path="email">Email: </form:label>   <form:input path="email"/>
		<form:errors path="email" element="span" cssClass="error"></form:errors> <br>
		
		<form:label path="marks">Mark: </form:label>   <form:input path="marks"/>
		<form:errors path="marks" element="span" cssClass="error"></form:errors> <br>
		

		<form:label path="gender">Gender: </form:label> 
			<form:radiobuttons path="gender" items="${genders}" delimiter=""/> 
			<form:errors path="gender" element="span" cssClass="error"></form:errors><br>
			
		<form:label path="faculty">Faculty: </form:label>
			<form:radiobuttons path="faculty" items="${faculties}"></form:radiobuttons> 
			<form:errors path="faculty" element="span" cssClass="error"></form:errors><br>	
			
		<form:label path="hobbies">Hobbies: </form:label>
			<form:checkboxes path="hobbies" items="${hobbies}"></form:checkboxes> 
			<form:errors path="hobbies" element="span" cssClass="error"></form:errors><br>	
			
		<form:button>Submit</form:button>	
		
		<h3>Note: ${message }</h3>
	</form:form>

</body>
</html>