<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Upload File</title>
</head>
<body>
	<form action="send" method="post" enctype="multipart/form-data">
		<label>From</label><br> <input name = "from"/> <br> <br>
		<label>To</label><br> <input name = "to"/> <br> <br>
		<label>Subject</label><br> <input name = "subject"/> <br> <br>
		<label>Content</label> <br> <textarea rows="5" cols="30" name="body"></textarea> <br> <br>
		<label>Attachment</label><br> <input type="file" name="attach"/> <br> <br>
		<button type="submit">Send</button>
	</form>
</body>
</html>