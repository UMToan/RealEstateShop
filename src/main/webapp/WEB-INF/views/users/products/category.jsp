<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglibjsp.jsp" %>
<head>
<link rel="stylesheet" href="<c:url value="/assets/user.css"></c:url>">
<title>Bất động sản bán</title>
<style>

.home-body h3 {
	text-transform: uppercase; 
}

.pagination {
	display: flex;
	justify-content: center;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
}

.pagination a.active {
	background-color: #00c4cc;
	color: white;
	border: 1px solid #00c4cc;
}

.pagination a:hover:not (.active ) {
	background-color: #ddd;
}
</style>

</head>
<body>
	<div class="content">
		<div class="home-price-section">
			<div class="content-section">
				
				<!--  <h2 class="section-heading">Bất động sản cho bán</h2>-->
				<c:forEach var="item" items="${ categorys }">
					<h2 class="section-heading">${ item.name }</h2> 
				</c:forEach>
				<!--Home-->
				<div class="row">
					<span style="margin-left: 25px;">Danh sách bất động sản</span>
					<select class="pull-right">
						<option>A - Z</option>
						<option>Cao - Thấp</option>
					</select>
				</div>
				<c:if test="${ productsPaginate.size() > 0 }">
					<div class="homes-list">
						<c:forEach var="item" items="${ productsPaginate }" varStatus="loop">
							<div class="home-item">
								<img
									src="<c:url value="/assets/image/img/${ item.id_img }"></c:url>"
									alt="Park Hill Home" class="home-img">
								<div class="home-body">
									<h3 class="home-heading">${ item.name }</h3>
									<p class="home-adrees">${ item.address }</p>
									<p class="home-sleep">Phòng ngủ: ${ item.bedroom }</p>
									<p class="home-shower">Phòng tắm: ${ item.barthroom }</p>
									<p class="home-area">Diện tích: ${ item.area }</p>
									<p class="home-price">Giá: ${ item.price }</p>
									<a href="<c:url value="/chi-tiet-bat-dong-san/${ item.id_product }"></c:url>" class="home-buy-btn">Xem chi
										tiết</a>
								</div>
							</div>

							<c:if
								test="${ (loopp.index + 1) % 3 == 0 || (loop.index + 1) == productsPaginate.size() }">
					</div>
					<c:if test="${ (loop.index + 1) < productsPaginate.size() }">
						<div class="homes-list">
					</c:if>
				</c:if>
				</c:forEach>

				</c:if>

			</div>

		</div>

		<div class="clear"></div>

	</div>
	<div class="pagination">
		<c:forEach var="item" begin="1" end="${ paginateInfo.totalPage }" varStatus="loop">
			<c:if test="${ (loop.index) == paginateInfo.currentPage }">
				<a href="<c:url value="/bat-dong-san/${ idCategory }/${ loop.index }"/>" class="active">${ loop.index }</a>
			</c:if>
			<c:if test="${ (loop.index) != paginateInfo.currentPage }">
				<a href="<c:url value="/bat-dong-san/${ idCategory }/${ loop.index }"/>">${ loop.index }</a>
			</c:if>
		</c:forEach>
	</div>
</body>