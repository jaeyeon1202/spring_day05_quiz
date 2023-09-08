<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@include file="../default/header.jsp" %>
	<h3>로그인 페이지 입니다</h3>
	
	<form action="loginChk" method="post">
		<input type="text" name="id"> <br>
		<input type="text" name="pw"> <br>
		<input type="submit" value="로그인">
		<a href="register">회원가입</a>
	</form>
		
	
	
<%@include file="../default/footer.jsp" %>
</body>
</html>