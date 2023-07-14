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