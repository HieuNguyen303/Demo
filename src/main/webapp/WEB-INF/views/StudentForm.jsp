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
	<form:form action="/student/form" modelAttribute="student" method="post">
		<form:label path="name">Name: </form:label>   <form:input path="name"/>
			<form:errors path="name" element="span" cssClass="error"></form:errors> <br>
		 
		 <form:label path="email">Name: </form:label>   <form:input path="email"/>
			<form:errors path="email" element="span" cssClass="error"></form:errors> <br>
		<form:label path="mark">Mark: </form:label>   <form:input path="mark"/>
		<form:errors path="mark" element="span" cssClass="error"></form:errors> <br>
		<form:label path="birthdate">Birthdate: </form:label>   <form:input path="birthdate"/> <br>
		<form:label path="gender">Gender:  </form:label> 
			<form:radiobutton path="gender" value="true" label="Male"/>
			<form:radiobutton path="gender" value="false" label="Female"/> 
			<form:errors path="gender" element="span" cssClass="error"></form:errors> <br><br>
		
		<form:label path="married">Married: </form:label>  
			<form:radiobutton path="married" value="true" label="Married"/>
			<form:radiobutton path="married" value="false" label="Not Married"/> 
			<form:errors path="married" element="span" cssClass="error"></form:errors> <br><br>	
			
		<form:label path="field">Field: </form:label> 
			<form:radiobuttons path="field" items="${fields }" delimiter=""/> 
			<form:errors path="field" element="span" cssClass="error"></form:errors> <br>
			
		<form:label path="faculty">Faculty</form:label> 
			<form:radiobuttons path="faculty" items="${faculties }" delimiter=""/> 
			<form:errors path="faculty" element="span" cssClass="error"></form:errors>
			<br>
			
		<form:label path="from">Nation: </form:label>
			<form:select path="from" items="${nations}" itemLabel="nationName" itemValue="nationId"></form:select> 
			<form:errors path="from" element="span" cssClass="error"></form:errors> <br>
			
		<form:label path="hobbies">Hobbies: </form:label>
			<form:checkboxes path="hobbies" items="${hobbies}"></form:checkboxes> 
			<form:errors path="hobbies" element="span" cssClass="error"></form:errors> <br><br>	
		<form:button>Submit</form:button>	
	</form:form>

</body>
</html>