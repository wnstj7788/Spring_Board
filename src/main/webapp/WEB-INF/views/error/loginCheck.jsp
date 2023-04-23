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



	<script type="text/javascript">
		alert("로그인이 정보를 확인해주세요 아이디가 없거나 틀린 비밀번호 입니다")
		location.href = "${root}";
	</script>



</body>
</html>