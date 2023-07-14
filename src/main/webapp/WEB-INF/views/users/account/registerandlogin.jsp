<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglibjsp.jsp"%>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/assets/loginn.css"></c:url>">
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Login and Registration</title>


<style>
body {
	height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;
	background-image: linear-gradient(0, rgba(61, 192, 172, 0.5),
		rgba(140, 187, 11, 0.5)),
		url(image/photo-1582407947304-fd86f028f716.avif);
	background-repeat: no-repeat;
	background-size: 100% 100%;
	background-color: #00c4cc;
}

.header__inner {
	display: none !important;
}

.navigation {
	display: none !important;
}

.footer {
	display: none !important;
}
</style>

</head>

<body>
	<div class="container">
		<div class="forms">
			<div class="form login">
			
				<span class="title">Đăng Nhập</span>
						
				<form:form action="dang-nhap" method="POST" modelAttribute="user">
				<c:if test="${ statusLogin  }">
				<h1 color="red">${statusLogin }</h1></c:if>	
					<div class="input-field">
						<form:input name="username" path="username" type="email"
							placeholder="Nhập email của bạn" required ="true" /> <i
							class="uil uil-envelope icon"></i>
					</div>

					<div class="input-field">
						<form:input name="password" path="password" type="password" class="password"
							placeholder="Nhập mật khẩu" required ="true"/> <i
							class="uil uil-lock icon"></i> <i
							class="uil uil-eye-slash showHidePw"></i>
					</div>

					<div class="checkbox-text">
						<div class="checkbox-content">
							<input type="checkbox" id="logCheck"> <label
								for="logCheck" class="text">Nhớ tài khoản</label>
						</div>

						<a href="#" class="text">Quên mật khẩu?</a>

					</div>

					<div class="input-field button">
						<input type=submit value="Đăng nhập">
					</div>
					<div class="input-field button__fb">
						<input type="button" value="Đăng nhập với Facebook"> <i
							class="uil uil-facebook"></i>
					</div>
					<div class="input-field button__gg">
						<input type="button" value="Đăng nhập với Google"> <i
							class="uil uil-google"></i>
					</div>
				</form:form>

				<div class="login-signup">
					<span class="text">Bạn chưa là thành viên? 
					<a href="#" class="text signup-link">Đăng ký ngay</a> 
					<a href="/BdsShop" class="text">/ Trang chủ</a>
					</span>
				</div>

			</div>

			<!--Registration form -->
			<div class="form sigup">
			
				<span class="title">Đăng ký</span>
				<c:if test="${ status }">
				<h1 color="red">${status }</h1></c:if>	
				<form:form action="dang-ky" method="POST" modelAttribute="user">

					<div class="input-field">
						<form:input type="email" path="username"
							placeholder="Nhập email của bạn" required ="true" />
						<i class="uil uil-envelope icon"></i>
					</div>

					<div class="input-field">
						<form:input type="text" path="display_name"
							placeholder="Nhập tên của bạn" required ="true" />
						<i class=" uil uil-user"></i>
					</div>
					<div class="input-field">
						<form:input type="password" path="password" class="password"
							placeholder="Nhập mật khẩu" required ="true" />
						<i class="uil uil-lock icon"></i>
					</div>

					<div class="checkbox-text">
						<div class="checkbox-content">
							<input type="checkbox" id="termCon"> <label
								for="logCheck" class="text">Tối chấp nhận tất cả
								điều khoản</label>
						</div>

					</div>

					<div class="input-field button">
						<input type="submit" value="Đăng ký ngay">

					</div>

				</form:form>
				<div class="login-signup">
					<span class="text">Bạn đã là thành viên? <a href="#"
						class="text login-link">Đăng nhập ngay</a>
					</span>
				</div>
				<script>
const container = document.querySelector(".container"),
pwShowHide = document.querySelectorAll(".showHidePw"),
pwFields = document.querySelectorAll(".password"),
signUp = document.querySelector(".signup-link"),
login = document.querySelector(".login-link");

// phần code ẩn hiện password và thay đổi icon
pwShowHide.forEach(eyeIcon =>{
   eyeIcon.addEventListener("click", ()=>{
      pwFields.forEach(pwField => {
         if(pwField.type ==="password"){
            pwField.type = "text";

            pwShowHide.forEach(icon => {
               icon.classList.replace("uil-eye-slash","uil-eye");
            })
         }
         else {
            pwField.type ="password";

            pwShowHide.forEach(icon => {
               icon.classList.replace("uil-eye","uil-eye-slash");
            })
         } 
      })
   })
})

signUp.addEventListener("click", ( )=>{
   container.classList.add("active");
});
login.addEventListener("click", ( )=>{
   container.classList.remove("active");
});
	
</script>
			</div>
		</div>
	</div>



</body>
