<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%
    request.setCharacterEncoding("UTF-8");
 	response.setContentType("text/html; charset=UTF-8");
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인덱스 페이지</title>
</head>
<body>
	<h1>이동한 jsp 화면</h1>
	${name}
	${param.value}
	
	<a href="./jobsSelectAll.do">jobs 테이블의 전체 목록 보기</a>
	<a href="./jobsSelectOne.do?id=AD_PRES">jobs 테이블 한개 보기</a>
</body>
</html>