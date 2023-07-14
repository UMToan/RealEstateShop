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
<title>Đặt Lịch</title>


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
			
				<span class="title">Nhâp thông tin đặt lịch</span>
							
				<form:form action="checkout" method="post" modelAttribute="bills">
            
            	<div class="input-field">
                <form:input type="text" placeholder="Họ tên" path="display_name" />
              	</div>
            
              <div class="input-field">
                <form:input type="text" placeholder="Nhập email của bạn" path="user" />
              </div>
  
              <div class="input-field">
                <form:input type="text" class="password" placeholder="Liên hệ" path="phone" required ="true"/>
              </div>
              
              <div class="input-field">
                <form:input type="text" placeholder="Địa chỉ" path="address" required ="true"/>
              	</div>
              
              <div class="input-field">
                <form:input type="text" placeholder="Ghi chú" path="note" required ="true"/>
              	</div>
  
              <div class="checkbox-text">
                <div class="checkbox-content">
                  <a href="<c:url value="/trang-chu"/>" class="text">Quay về</a>
                </div>
  
              
                <input type="submit" name="submitAccount" value="Hoàn tất"
										class="text">
              </div>

            </form:form>

				

			</div>

			<div class="form sigup">
			
				<span class="title">Đăng ký</span>
				
				<h1 color="red"></h1>	
				<form>

					<div class="input-field">
						<form type="text"
							placeholder="Nhập email của bạn" />
						<i class="uil uil-user"></i>
					</div>

					<div class="input-field">
						<form type="text"
							placeholder="Nhập tên của bạn" />
						<i class="uil uil-envelope icon"></i>
					</div>
					<div class="input-field">
						<form type="password" path="password" class="password"
							placeholder="Nhập mật khẩu" />
						<i class="uil uil-lock icon"></i>
					</div>

					
				</form>
				
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
	
</body>
</html>