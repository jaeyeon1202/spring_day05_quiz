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
<%@include file="../default/header.jsp" %>
	
	<h2 align="center">게 시 판</h2>
	<table border="1">
		<tr>
			<th>번호</th> <th>id</th> <th>제목</th> 
			<th>날짜</th> <th>조회수</th> <th>image_file_name</th>
		</tr>
			<c:if test="${list.size() == 0 }">
					<th colspan="6">등록된 글이 없습니다.</th>
			</c:if>
			<c:forEach var="dto" items="${list}">
				<td>${dto.writeNo }</td> <td>${dto.id }</td> 
				<td>${dto.title }</td><td>${dto.saveDate }</td> 
				<td>${dto.hit }</td> <td>${dto.imageFileName }</td>
			</c:forEach>
		<tr>
			<td colspan="6"><a href="writeForm">글작성</a></td>
		</tr>
	</table>


<%@include file="../default/footer.jsp" %>
</body>
</html>