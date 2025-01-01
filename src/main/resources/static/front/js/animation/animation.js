const animation__top = new Swiper(".animation__top .swiper", {
  direction: "horizontal", // 슬라이드 방향 (horizontal)
  loop: true, // 무한 반복
  autoplay: {
    delay: 3000, // 자동 슬라이드 시간 간격 (ms)
    disableOnInteraction: false, // 사용자가 슬라이더를 조작해도 자동 슬라이드 유지
  },
  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev",
  },
});

const animation__video = new Swiper(".animation__video .swiper", {
  direction: "horizontal", // 슬라이드 방향 (horizontal)
  loop: true, // 무한 반복

  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev",
  },
});
