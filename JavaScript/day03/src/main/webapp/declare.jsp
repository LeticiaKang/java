<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>선언문 연습</h3>
<%!
	//필드 변수 선언
	int globalCnt = 0;
%>

<h3>스크립트릿</h3>
<%	
	int localCnt = 0;
	for(int k=1; k < 10; k++){
		globalCnt += k;
		localCnt += k;
	}
		out.print("<br>globalCnt: " + ++globalCnt);
		out.print("<br>localCnt: " + ++localCnt);
%>

</body>
</html>