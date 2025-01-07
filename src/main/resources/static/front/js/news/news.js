  document.querySelectorAll(".card").forEach((card) => {
    const theme = card.querySelector(".card__sub__title li")?.textContent.trim();
    const colors = {
      공지: "#FED856",
      이벤트: "#47C564",
      게임: "#FF0000",
      카드게임: "#0080FF",
      "애니&영화": "#005984",
      상품: "#9E41CC",
    };
    card.style.borderBottom = colors[theme] ? `3px solid ${colors[theme]}` : "none";
  });