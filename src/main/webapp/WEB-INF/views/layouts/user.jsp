<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglibjsp.jsp" %> 	
	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<c:url value="/assets/style.css"></c:url>">
<link rel="stylesheet"href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<title><decorator:title default="Master-Layout" /></title>
<decorator:head/>
</head>

<body>
	<div class="main">

		<%@include file="/WEB-INF/views/layouts/user/header.jsp" %>
		
		<decorator:body />

		<%@include file="/WEB-INF/views/layouts/user/footer.jsp" %>
		
	</div>
</body>

</html>