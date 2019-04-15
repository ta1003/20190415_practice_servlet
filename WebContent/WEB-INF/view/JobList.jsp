<%@page import="java.util.List"%>
<%@page import="com.min.dto.Jobs_DTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%
    request.setCharacterEncoding("UTF-8");
 	response.setContentType("text/html; charset=UTF-8");
 	List<Jobs_DTO> lists = (List<Jobs_DTO>)request.getAttribute("lists");
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인덱스 페이지</title>
</head>
<body>
	<div>
		<table>
			<thead>
				<tr>
					<th>직업ID</th><th>직업</th><th>최대급여</th><th>최소급여</th>
				</tr>
			</thead>
			<tbody>
				<%
					for(Jobs_DTO dto: lists){
						%>
						<tr>
							<td><%=dto.getJob_id()%></td><td><%=dto.getJob_title()%></td>
							<td><%=dto.getMax_salary()%></td><td><%=dto.getMin_salary()%></td>
						</tr>						
						<%
					}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>