<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ㅋㅋ</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>PW</td>
			<td>이름</td>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td> ${list.member_id}</td>
				<td> ${list.member_pwd}</td>
				<td> ${list.member_name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>