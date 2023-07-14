<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglibjsp.jsp" %>

<title>RealEstate-Toan&Nghia</title>
<style>

	.home-item {
		height: 517.16px;
	}
	.see_more{
		margin-left: 360px;
    	background-color: #00c4cc;
    	color: #fff;
    	border: none;
    	border-radius: 5px;
	}
	.see_more a{
		font-size: 20px;
    	text-decoration: none;
    	color: #fff;
    	padding-left: 5px;
    	padding-right: 5px;
	}
</style>
<body>
	<div class="content">
		<div class="home-price-section">
			<div class="content-section">
				<!--  <h2 class="section-heading">Bất động sản cho bán</h2>-->
				<c:forEach var="item" items="${ categorys }">
					<h2 class="section-heading">${ item.name }</h2>
				</c:forEach>
				<!--Home-->
				
				<c:if test="${ products.size() > 0 }">
					<div class="homes-list">					
						<c:forEach var="item" items="${ products }" varStatus="loop">
							<div class="home-item">
								<img src="<c:url value="/assets/image/img/${ item.id_img }"></c:url>"
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
							
							<c:if test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1) == products.size() }">
									</div>
									<c:if test="${ (loop.index + 1) < products.size() }">
										<div class="homes-list">
									</c:if>
							</c:if>
						</c:forEach>
						
					<c:forEach var="item" items="${ categorys }">
					<div class="btn_seemore">
                     		<button class="see_more" type="submit">
                        		<i class="fa fa-arrow-down" aria-hidden="true"></i>
                        		<a href='<c:url value="/bat-dong-san/${ item.id }"/>'
							>Xem thêm</a>
                     		</button>
                  		</div>
					</c:forEach>																				
						
				</c:if>
				
			</div>
		</div>
		<div class="clear"></div>
		<div class="home-rent-section">
		<div class="content-section">
			<!--  <h2 class="section-heading">Bất động sản cho thuê</h2>-->
			<c:forEach var="item" items="${ categorysrents }">
				<h2 class="section-heading">${ item.name }</h2>
			</c:forEach>
			<c:if test="${ products.size() > 0 }">
					<div class="homes-list">					
						<c:forEach var="item" items="${ products }" varStatus="loop">
							<div class="home-item">
								<img src="<c:url value="/assets/image/img/${ item.id_img }"></c:url>"
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
							
							<c:if test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1) == products.size() }">
									</div>
									<c:if test="${ (loop.index + 1) < products.size() }">
										<div class="homes-list">
									</c:if>
							</c:if>
						</c:forEach>																				
						
				</c:if>
				<c:forEach var="item" items="${ categorysrents }">
					<div class="btn_seemore">
                     		<button class="see_more" type="submit">
                        		<i class="fa fa-arrow-down" aria-hidden="true"></i>
                        		<a href='<c:url value="/bat-dong-san/${ item.id }"/>'
							>Xem thêm</a>
                     		</button>
                  		</div>
					</c:forEach>
			<div class="clear"></div>
		</div>
	</div>
	</div>

	
	
</body>
