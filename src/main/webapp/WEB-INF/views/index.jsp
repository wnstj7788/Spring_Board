<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

	<%-- 페이지만의 내용 --%>
	<div class="container p-4">

		<c:if test="${empty loginInfo}">
			<div class="container text-center">
				<div class="row justify-content-center">
					<div class="card col-lg-2 me-2" style="width: 18rem;">
						<%-- 						<img src="${root}/resources/boardImg.png" class="card-img-top"
							alt="boardImg"> --%>
						<div class="card-body">
							<h5 class="card-title">판매 상품 확인 </h5>
							<p class="card-text"> 제품 작성은 로그인 후 사용할 수 있습니다.</p>
							<a href="${root}/product/list" class="btn btn-primary">판매 상품 보러가기</a>
						</div>
					</div>
				</div>
			</div>

		</c:if>


		<c:if test="${not empty loginInfo}">
			<script type="text/javascript">
				location.href = "${root}/product/list";
			</script>


		</c:if>


	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>