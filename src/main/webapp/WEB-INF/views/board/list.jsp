<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<%@ include file="/WEB-INF/views/include/head.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/nav.jsp"%>
	
	
	
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">code</th>
      <th scope="col">model</th>
      <th scope="col">price</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${products}" var="p">
  
    <tr>
      <td>${p.code}</td>
      <td>${p.model }</td>
      <td>${p.price}</td>
    </tr>
   </c:forEach>
  </tbody>
</table>
	
	
	
	

</body>
</html>