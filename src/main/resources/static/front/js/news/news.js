  document.addEventListener("DOMContentLoaded", function() {
    // 모든 card__sub__title 요소를 가져옵니다
    const subTitles = document.querySelectorAll('.card__sub__title');

    // 각 subTitle에 대해 반복하면서 색상 변경
    subTitles.forEach(subTitle => {
      const textContent = subTitle.textContent.trim();  // 텍스트를 추출하고 양쪽 공백을 제거

      // 카테고리별로 border-bottom 색상 지정
      if (textContent.includes("카드 게임")) {
        subTitle.closest('.card').style.borderBottom = "5px solid #0080FF";  // 카드 게임 색상
        subTitle.closest('.card').querySelector('.card__sub__button').style.backgroundColor = "#0080FF";  // 카드 게임 버튼 배경색
      } else if (textContent.includes("이벤트")) {
        subTitle.closest('.card').style.borderBottom = "5px solid #FFC300";  // 이벤트 색상
        subTitle.closest('.card').querySelector('.card__sub__button').style.backgroundColor = "#FFC300";  // 이벤트 버튼 배경색
      } else if (textContent.includes("게임")) {
        subTitle.closest('.card').style.borderBottom = "5px solid #FF0000";  // 게임 색상
        subTitle.closest('.card').querySelector('.card__sub__button').style.backgroundColor = "#FF0000";  // 게임 버튼 배경색
      } else if (textContent.includes("공지")) {
        subTitle.closest('.card').style.borderBottom = "5px solid #33AFFF";  // 공지 색상
        subTitle.closest('.card').querySelector('.card__sub__button').style.backgroundColor = "#33AFFF";  // 공지 버튼 배경색
      } else if (textContent.includes("애니")) {
        subTitle.closest('.card').style.borderBottom = "5px solid #005984";  // 애니&영화 색상
        subTitle.closest('.card').querySelector('.card__sub__button').style.backgroundColor = "#005984";  // 애니&영화 버튼 배경색
      } else if (textContent.includes("상품")) {
        subTitle.closest('.card').style.borderBottom = "5px solid #9E41CC";  // 상품 색상
        subTitle.closest('.card').querySelector('.card__sub__button').style.backgroundColor = "#9E41CC";  // 상품 버튼 배경색
      }
    });
  });