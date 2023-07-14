<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="header__inner">
	<div class="lo">
		<img class="logo" src="<c:url value="/assets/image/logo.jpg"></c:url>"
			alt="">
	</div>
	<ul class="menu">
		<li class="menu__item"><a href="/BdsShop" class="menu__link">Trang
				chủ</a></li>
		<li class="menu__item"><a href="<c:url value="/info"></c:url>"
			class="menu__link">Giới thiệu</a></li>
		<li class="menu__item"><a href="" class="menu__link">Bất
				động sản</a>
			<div class="menu__child">
				<div class="menu__child-item">
					<ul class="menu__child-list">
						<li class="menu__child__child"><a
							href="/BdsShop/bat-dong-san/1" class="menu__link__child">Bất
								động sản bán</a></li>

						<li class="menu__child__child"><a
							href="/BdsShop/bat-dong-san/1" class="menu__link__child">Bất
								động sản thuê</a></li>


					</ul>
				</div>
			</div></li>
		<li class="menu__item"><a href="<c:url value="/noinf"></c:url>"
			class="menu__link">Liên hệ</a></li>


		<c:if test="${ not empty LoginInfo }">
			<li class="menu__item"><a href="<c:url value="/post"></c:url>"
				class="menu__link">Đăng tin</a></li>
		</c:if>
		<c:if test="${ not empty LoginInfo }">
			<li class="menu__item"><a href="<c:url value="/tu-van"></c:url>"
				class="menu__link" style="color: red" > (${ TotalQuantyCart }) Tư vấn</a></li>
		</c:if>
		<c:if test="${ empty LoginInfo }">

			<li class="menu__item"><a
				href="<c:url value="/dang-ky"></c:url>" class="menu__link">Đăng
					nhập</a></li>

		</c:if>
		<c:if test="${ not empty LoginInfo }">
			<li class="menu__item"><a
				href="<c:url value="/PersonManager"></c:url>" class="menu__link">${ LoginInfo.display_name }</a></li>
			<li class="menu__item"><a
				href="<c:url value="/dang-xuat"></c:url>" class="menu__link">Đăng
					Xuất</a></li>
		</c:if>


	</ul>

</div>
<div class="navigation">
	<div class="h1">
		<h1>
			Hãy để chúng tôi dẫn lối bạn <br> đến ngôi nhà mơ ước
		</h1>
	</div>
	<div class="body_navigation">
		<div class="body__inner">
			<!-- search box -->
			<div class="dropdown">
				<!-- dropdown -->
				<select name="select__box" class="dropdown__list">
					<option selected disabled>Loại nhà đất</option>
					<c:forEach var="item" items="${ categorys }">
						<option class="option__style" value="1">Bất động sản
							bán</option>
					</c:forEach>

					<option class="option__style" value="2">Bất động sản
						thuê</option>

				</select>
			</div>
			<form class="search__field" action="search">
				<input type="text" class="input" name="txt"
					placeholder="Nhập địa điểm hoặc từ khóa (Ví dụ: Vinhome)">
				<button class="btn__search" type="submit">
					<i class="fa fa-search"></i> <span>Tìm kiếm</span>
				</button>
			</form>
		</div>

	</div>
</div>