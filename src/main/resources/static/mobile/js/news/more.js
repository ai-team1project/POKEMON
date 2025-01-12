document.addEventListener("DOMContentLoaded", function () {
  const cards = document.querySelectorAll(".card"); // 모든 카드 요소를 가져옵니다
  const moreDiv = document.querySelector(".more"); // .more div 요소를 선택합니다
  const cardsPerPage = 20; // 한 페이지에 표시할 카드 개수
  let currentIndex = 0; // 현재 페이지의 카드 인덱스

  // 초기 20개 카드만 보이게 설정
  function showCards() {
    // 모든 카드를 숨기고
    cards.forEach((card, index) => {
      if (index < currentIndex + cardsPerPage) {
        card.style.display = "block"; // 보이게 설정
      } else {
        card.style.display = "none"; // 숨기기
      }
    });

    // 더보기 버튼이 더 이상 필요 없으면 .more 요소 자체를 숨깁니다
    if (currentIndex + cardsPerPage >= cards.length) {
      moreDiv.style.display = "none"; // .more div를 숨깁니다
    }
  }

  // 더보기 버튼 클릭 시
  moreDiv.addEventListener("click", function () {
    currentIndex += cardsPerPage; // 카드 인덱스를 증가시킴
    showCards(); // 카드 다시 표시
  });

  // 초기 카드 표시
  showCards();
});
