<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%@ include file="/WEB-INF/views/include/nav.jsp"%>


	<form action="${root}/product/write" method="post">
		code : <input type="text" name="code"> 
		<br> 
		model : <input type="text" name="model"> 
		<br>
		price : <input type="number" name="price">
		<input type = "submit" value="작성완료"> 
		
	</form>

</body>
</html>