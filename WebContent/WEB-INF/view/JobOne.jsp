<%@page import="com.min.dto.Jobs_DTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%
    request.setCharacterEncoding("UTF-8");
 	response.setContentType("text/html; charset=UTF-8");
 	
 	Jobs_DTO dto = (Jobs_DTO)request.getAttribute("dto");
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한개 나와라</title>
</head>
<body>
	<%=dto %>
</body>
</html>