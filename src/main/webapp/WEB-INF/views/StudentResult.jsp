<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info</title>
</head>
<body>
	<h2>Information </h2>
	Your Name : ${student.name}<br>
	Your Mark : ${student.mark}<br>
	Your Birth : 
	<fmt:formatDate value="${student.birthdate}" pattern="MMM, dd-yyyy"/><br>
	Gender : ${student.gender==true?"Male":"Female"}<br>
	Marriage : ${student.married==true?"Married":"Not Married"}<br>
	Field : ${student.field}<br>
	From : ${student.from}<br>
	Your Hobbies :
	<c:forEach var="hobby" items="${student.hobbies}">
		${hobby}&nbsp;
	</c:forEach>
</body>
</html>