<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">CARE LAB</h1>
	<hr>
		<p align="right">
			<a href="/root/member/index">HOME</a>
			<a href="/root/member/list">회원 정보</a>
			<a href="/root/board/boardList">게시판</a>
			<c:choose>
				<c:when test="${session != null }">
					<a href="/root/member/logout">로그아웃</a>
				</c:when>
				<c:otherwise>
					<a href="/root/member/login">로그인</a>
				</c:otherwise>
			</c:choose>
		</p>
	<hr>
</body>
</html>