<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglibjsp.jsp" %>
<head>
<link rel="stylesheet" href="<c:url value="/assets/phh.css"></c:url>">
<meta charset="UTF-8">
<title>Chi tiết bất động sản</title>
<script>
window.addEventListener("load", function(){   
	const slider = document.querySelector(".slider");
	const sliderMain = document.querySelector(".slider-main");
	const sliderItems =document.querySelectorAll(".slider-item");
	const nextbtn = document.querySelector(".slider-next");
	const prevbtn = document.querySelector(".slider-prev");
	const dotItem = document.querySelectorAll(".slider-dot-item");
	const sliderItemWidth = sliderItems[0].offsetWidth;
	const sliderLength = sliderItems.length;
	let postionX = 0;
	let index = 0;
	   nextbtn.addEventListener("click", function(){
	      handleChangeSlide(1);
	   });

	   prevbtn.addEventListener("click", function(){
	      handleChangeSlide(-1);
	   });
	   [...dotItem].forEach(item => item.addEventListener("click", function(e){
	      [...dotItem].forEach((el) => el.classList.remove("active"));
	      e.target.classList.add("active");
	      const slideIndex = e.target.dataset.index;
	      index = slideIndex;
	      postionX = -1 * index * sliderItemWidth;
	      sliderMain.style = `transform: translateX(${postionX}px)`;
	   }));

	   function handleChangeSlide(direction) {
	      if (direction === 1)
	      {
	         if (index >= sliderLength - 1) 
	         {
	            index = sliderLength - 1 ;
	            return;
	         }
	         postionX = postionX - sliderItemWidth;
	         sliderMain.style = `transform: translateX(${postionX}px)`;
	         index ++;
	      }
	      else if (direction === -1)
	      {
	         if (index <= 0)
	         {
	            index = 0;
	            return;
	         }
	         postionX = postionX + sliderItemWidth;
	         sliderMain.style = `transform: translateX(${postionX}px)`;
	         index --;
	      }
	      [...dotItem].forEach((el) => el.classList.remove("active"));
	      dotItem[index].classList.add("active");
	   }
	});
</script>
<style>
	.content-about .status {
   height: 60px;
   width: 27%;
   background-color: #00c4cc;
   font-size: 21px;
   border: none;
   font-weight: 500;
   text-transform: uppercase;
   color: #fff;
   cursor: pointer;
   transition: ease 0.5s;
   display: flexbox;
}
	.status p{

    display: contents;
    }



.status:hover {
   background-color: #06aaaf;

}
</style>
</head>
<body>
<div class="slider">
            <i class="fa fa-angle-left fa-2x slider-prev" aria-hidden="true"></i>
            <i class="fa fa-angle-right fa-2x slider-next" aria-hidden="true"></i>
            <ul class="slider-dots">
               <li class="slider-dot-item active" data-index="0"></li>
               <li class="slider-dot-item" data-index="1"></li>
               <li class="slider-dot-item" data-index="2"></li>
               <li class="slider-dot-item" data-index="3"></li>
               <li class="slider-dot-item" data-index="4"></li>
            </ul>
            <div class="slider-wrapper">
               <div class="slider-main">
                  <div class="slider-item">
                     <img src="<c:url value="/assets/image/img/${ productRents.id_img }"></c:url> " alt="" />
                  </div>
                  <div class="slider-item">
                     <img src="<c:url value="/assets/image/img/${ productRents.id_img }"></c:url>" alt="" />
                  </div>
                  <div class="slider-item">
                     <img src="image/slide_show/phh3.jpg" alt="" />
                  </div>
                  <div class="slider-item">
                     <img src="image/slide_show/phh4.jpg" alt="" />
                  </div>
                  <div class="slider-item">
                     <img src="image/slide_show/phh5.jpg" alt="" />
                  </div>
               </div>
            </div>
         </div>
        <!-- <script src="/assets/slider.js"></script> --> 
	<div class="contents">
            <div class="content-information">
               <div class="in-heading">
                  <p class="home-sleep">Phòng ngủ: ${ productRents.bedroom }</p>
                  <p class="home-shower">Phòng tắm: ${ productRents.barthroom }</p>
                  <p class="home-area">Diện tích: ${ productRents.area }</p>
                  <p class="home-price">${ productRents.price }</p>
               </div>
               <div class="content-about">
                  <h1 class="about-heading">${ productRents.name }</h1>
                  <p class="home-adrees">${ productRents.address }</p>
                  <p class="home-about">Quận huyện: Long Biên <br>
                     Kiểu dự án: Chung cư <br>
                     Chủ đầu tư: Tổng công ty TNHH Bình Minh <br>
                     Loại hình đầu tư: Chung cư Park Hill Home có vị trí thuận lợi, ngay đầu đường 5, cách cầu Chương Dương
                     chỉ 3km, chỉ cần 10' có thể đi vào trung tâm Hà Nội. Diện tích thông thủy 69m2, hướng ban công Đông
                     Nam rất lộc cho gia chủ (nhìn ra hướng đường Nguyễn Văn Cừ)
                  </p>
                  <div class="btn-contact">
                     <button class="contact">Liên hệ ngay: 0363397844</button>
                     <button class="status">Tình trạng:</button>
                  </div>
               </div>
            </div>
            <div class="overview">
               <div class="over-heading">
                  <h3 class="over-h3-heading">Tổng quan</h3>
               </div>
               <div class="overview-about">
                  <p class="about-content">
                     Chung cư có vị trí thuận lợi, ngay đầu đường 5, cách cầu Chương Dương chỉ 3km, chỉ cần
                     10' có thể đi vào trung tâm Hà Nội. Diện tích thông thủy 69m2, hướng ban công Đông Nam rất lộc cho gia
                     chủ (nhìn ra hướng đường Nguyễn Văn Cừ). Lô đất ngay cạnh chung cư được quy hoạch để xây trường mẫu
                     giáo. <br>
                     Căn hộ có 2 phòng ngủ, 2 vệ sinh, phòng khách logia nhìn thẳng ra vườn cây, 1 logia phụ từ khu bếp đi
                     ra nên đun nấu rất thoáng, phơi quần áo thoải mái không vướng tầm nhìn.
                     Trong nhà có sàn gỗ, trần thạch cao, thiết bị vệ sinh, thiết bị chiếu sáng đầy đủ, đã có sẵn đường
                     chạy ống đồng điều hòa nên khách chỉ việc lắp. <br>
                     Nhà đã được kiểm tra kỹ càng khi bàn giao vào Tháng 1/2020, chất lượng đảm báo không bị thấm nước, độ
                     hoàn thiện cao. <br>
                     Quần thể xung quanh chung cư đa dạng gồm: <br>
                     - Quảng trường trung tâm <br>
                     - Sân cầu lông <br>
                     - Vườn nướng BBQ <br>
                     - Vườn nhiệt đới + Điểm phục vụ vui chơi thể thao dân cư chung <br>
                     - Vườn cây bốn mùa <br>
                     - Bể bơi ngoài trời <br>
                     - Khu Cafe thư giãn và nhà hàng ăn uống <br>
                     - Khu thương mại dịch vụ và siêu thị <br>
                     Nhà rất hợp cho gia đình vợ chồng trẻ mới cưới hoặc mới có con nhỏ, thu nhập trên dưới 30 triệu.
                  </p>
               </div>
            </div>
            <div class="map">
               <div class="map-heading">
                  <h3 class="map-h3-heading">Địa chỉ</h3>
               </div>
               <div id="map">
                  <iframe
                     src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7447.139700465308!2d105.88223267453009!3d21.04989064394767!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135a9780c24ee9b%3A0x9b6eb75e994181e8!2zR2lhIFRo4buleSwgTG9uZyBCacOqbiwgSMOgIE7hu5lpLCBWaeG7h3QgTmFt!5e0!3m2!1svi!2s!4v1666685087108!5m2!1svi!2s"
                     width="1150" height="370" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
               </div>
            </div>
         </div>
</body>
