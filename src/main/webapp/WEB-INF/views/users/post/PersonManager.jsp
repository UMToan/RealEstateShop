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
<title>Thông tin cá nhân</title>

<style>
.sidebar-content {
	margin-top: 0px;
	height: 100vh;
}
.content {
	height:500px;
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
			<a href="#"><i class="fa fa-user-circle-o" aria-hidden="true"></i><span>Chỉnh sửa thông tin</span></a> 
			<a href="#"><i class="fa fa-cogs" aria-hidden="true"></i><span>Quản lí tin đăng</span></a> 
			<a href="<c:url value="/noinf"></c:url>"><i class="fa fa-phone" aria-hidden="true"></i><span></span>Liên hệ</a> 
			<a href="<c:url value="/trang-chu"/>"><i class="fa fa-sign-out" aria-hidden="true"></i><span></span>Thoát</a>

		</div>

		<div class="content">
			<div class="heading">
				<h1 class="content-heading">Quản lý thông tin cá nhân</h1>
			</div>
			<div class="content-about">
				<form:form action="PersonManager" method="post" modelAttribute="bills">
				<div class="about">
				<span style="display: flex">Tên: <form:input type="text" placeholder="Họ tên" path="display_name" /></span>
				</div>
				<div class="about">
					<span style="display: flex">Mail: <form:input type="text" placeholder="Nhập email của bạn" path="user" /></span>
				</div>
				<div class="about">
					<span style="display: flex">Password: <form:input type="password" class="password" placeholder="Liên hệ" path="total" /></span>
				</div>

</form:form>
			</div>
			
			<div class="content-btn">
			<button class="btn">
			<a href="<c:url value="/trang-chu"/>" ><p style="text-transform: none;">Về trang chủ</p></a> 
			</button>
				
			</div>
			
		</div>
	</div>
</body>
