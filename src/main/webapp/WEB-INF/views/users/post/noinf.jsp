<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglibjsp.jsp"%>

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="stylesheet" href="<c:url value="/assets/noinfor.css"></c:url>">
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Liên hệ </title>
<style>
      table, th, td {
        border:2px solid black;
        margin-left: auto;
		margin-right: auto; 
      }
      .mainn{
      	margin: 50px auto 50px auto;
      }
      .contact__Toan{
      	font-size: 15px;
      	margin: 0px auto 0px auto;	
      }
      h2{
		margin-left: auto;
    margin-right: auto;
    width: 500px;
      }
      .mainn{
      background-color: #17b6a5;
    color: #dede72;
    width: 600px;}

</style>
</head>
<body>
	<div class="mainn">
      <div class="contact__Toan">
         <h2>Liên hệ với chúng tôi</h2>

         <table style="width:500px">
            <tr>
               <th>Họ Tên</th>
               <th>Số điện thoại</th>
               <th>Mail</th>
               <th>Facebook</th>
            </tr>
            <tr>
               <td>Ung Minh Toàn</td>
               <td>0363397844</td>
               <td>minhtoan812002@gmail.com</td>
               <td><a href="https://www.facebook.com/profile.php?id=100007111606614">FB của Toàn</a></td>
            </tr>
            <tr>
               <td>Trương Bùi Phước Nghĩa</td>
               <td>0376154794</td>
               <td>truongnghia1209876@gmail.com</td>
               <td><a href="https://www.facebook.com/TruongBuiPhuocNghia">FB của Nghĩa</a></td>
            </tr>
         </table>
      </div>
   </div>
</body>
