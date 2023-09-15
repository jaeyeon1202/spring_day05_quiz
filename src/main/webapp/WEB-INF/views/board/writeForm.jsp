<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
   <script type="text/javascript">
      function readURL(input){
         var file = input.files[0] //파일에 대한 정보
         if( file != ''){
            var reader = new FileReader();
            reader.readAsDataURL(file); //일고
            reader.onload = function (e){ //로드한 값을 표현
               $("#preview").attr('src', e.target.result);
            }
         }
      }
   </script>
</head>
<body>
<%@include file="../default/header.jsp" %>
	<h3 >글쓰기</h3>
	<form action="writeSave" method="post" enctype="multipart/form-data">
		<b>작성자</b> <br> <input type="text" name="id" value="${session }">  <hr>
		<b>제목</b> <br> <input type="text" name="content"> <hr>
		<b>내용</b> <br> <textarea rows="5" cols="10"></textarea> <hr>
		
		<b>이미지파일 첨부</b> <br>
		<input type="file" name="image_file_name" onchange="readURL(this);"/>
		<img id="preview" src="#" width="100" height="100" alt="선택된 이미지가 없습니다." />
		<hr>
		<input type="submit" value="글쓰기">
		<button type="button">목록보기</button>
	</form>
<%@include file="../default/footer.jsp" %>
</body>
</html>