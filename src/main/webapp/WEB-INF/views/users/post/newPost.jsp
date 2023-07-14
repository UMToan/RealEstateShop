<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglibjsp.jsp"%>


<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="<c:url value="/assets/dangtin.css"></c:url>">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Đăng tin</title>

<style>
.sidebar-content {
	margin-top: 0px;
}
.sidebar h4 {
    color: #000;
    margin-top: 0;
    margin-bottom: 10px;
    font-size: 15px;
}
</style>

</head>

<body>
	<div class="sidebar-content">
		<div class="sidebar">
			<center>
				<img src="<c:url value="/assets/image/slidebar/toanm.jpg"></c:url>"
					class="profile_img" alt="">
				<h4>${ LoginInfo.display_name }</h4>
			</center>
			<a href="<c:url value="/PersonManager"></c:url>"><i class="fa fa-user-circle-o" aria-hidden="true"></i><span>Chỉnh sửa thông tin</span></a> 
			<a href="#"><i class="fa fa-cogs" aria-hidden="true"></i><span>Quản lí tin đăng</span></a> 
			<a href="#"><i class="fa fa-phone" aria-hidden="true"></i><span></span>Liên hệ</a> 
			<a href="#"><i class="fa fa-sign-out" aria-hidden="true"></i><span></span>Thoát</a>

		</div>

		<div class="content">
			<div class="heading">
				<h1 class="content-heading">Đăng tin mới</h1>
			</div>
			<div class="content-about">
				<h2 class="content-h2-heading">Thông tin mô tả</h2>
				<div class="about">
					<label>Loại Bất Động Sản</label> <select name="price-rent"
						class="about">
						<option selected disabled>--Chọn loại chuyên mục--</option>
						<option class="option" value="1">Bất Động Sản bán</option>
						<option class="option" value="2">Bất Động Sản thuê</option>
					</select>
				</div>

				<div class="about">
					<label>Nội dung mô tả bất động sản</label>
					<textarea name="" id="about-b" cols="30" rows="10"></textarea>
				</div>
				<div class="about">
					<label>Giá cho thuê</label> <input id="about" type="text">
					<small class="form-text text-muted">Nhập đầy đủ số, ví dụ 1
						triệu thì nhập là 1,000,000</small>
				</div>
				<div class="about">
					<label>Diện tích</label> <input id="post_acreage" type="text"
						attern="[0-9.]+" name="dien_tich" max="1000"
						class="form-control valid" required=""
						data-msg-required="Bạn chưa nhập diện tích" aria-invalid="false">
					<small class="form-text text-muted">Nhập đầy đủ diện tích
						với 1 tương tự 1m²</small>
				</div>
				<div class="about">
					<label>Phòng ngủ</label> <input id="post_acreagee" type="num"
						attern="[0-9.]+" name="phong_ngu" max="100"
						class="form-control valid" required=""
						data-msg-required="Bạn chưa nhập phòng ngủ" aria-invalid="false">
					<small class="form-text text-muted">Nhập đầy đủ số phòng
						ngủ</small>
				</div>
				<div class="about">
					<label>Phòng tắm</label> <input id="post_acreageee" type="number"
						attern="[0-9.]+" name="phong_tam" max="100"
						class="form-control valid" required=""
						data-msg-required="Bạn chưa nhập phòng tắm" aria-invalid="false">
					<small class="form-text text-muted">Nhập đầy đủ số phòng
						tắm</small>
				</div>

			</div>
			<div class="content-about">
				<h2 class="content-h2-heading">Địa chỉ cho thuê</h2>
				<div class="about">
					<label>Nhập Địa chỉ cụ thể </label> <input type="text"> <small
						class="form-text text-muted">VD: đường số 7, khu Tên Lửa,
						Bình Tân</small>
				</div>

			</div>
			<div class="content-about">
				<div class="content-h3-heading">
					<h2 class="content-h2-heading">Hình ảnh</h2>
				</div>
				<div class="form-image">
					<div class="form-image-text">
						<p>Cập nhật hình ảnh rõ ràng sẽ cho thuê nhanh hơn</p>
					</div>
					<div class="form-choose-image">
						<input type="file" style="display: none;" name="file" id="file">
						<label for="file"> <i class="fa fa-picture-o fa-3x"
							aria-hidden="true"></i> <span class=""> Chọn ảnh </span>
						</label>
					</div>
				</div>
			</div>
			<div class="content-btn">
				<button class="btn">Đăng tin</button>
			</div>
		</div>
	</div>
</body>
