<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	BoardDao dao = new BoardDao();
	List<BoardVo> ls = dao.selectAll();
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>목록</title>
</head>
<body>
	<h2>게시글 목록</h2>
	<c:forEach var="board" items="${ls}">
		<p>${board}</p>	
	</c:forEach>
</body>
</html>