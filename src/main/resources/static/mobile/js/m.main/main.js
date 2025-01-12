// swiper__container에서는 오토슬라이드 활성화
const swiperContainer = new Swiper(".swiper__container .swiper", {
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

const new__video = new Swiper(".new__video .swiper", {
  direction: "horizontal", // 슬라이드 방향 (horizontal)
  loop: true, // 무한 반복
  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev",
  },
});

// card__game에서는 오토슬라이드 비활성화
const cardGame = new Swiper(".card__game .swiper", {
  direction: "horizontal", // 슬라이드 방향 (horizontal)
  loop: true,
  autoplay: false, // 오토슬라이드 비활성화
  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev",
  },
});

const main__animation = new Swiper(".main__animation .swiper", {
  direction: "horizontal", // 슬라이드 방향 (horizontal)
  loop: true,
  autoplay: false, // 오토슬라이드 비활성화
  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev",
  },
});
