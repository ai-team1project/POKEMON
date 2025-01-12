// 하트 버튼 클릭 시 포켓몬 보이기/숨기기
document.querySelectorAll('.heart-btn').forEach(function (heartBtn) {
    heartBtn.addEventListener('click', function () {
        const pokemonCard = heartBtn.closest('.pokemon-card'); // 하트 버튼의 부모 요소인 포켓몬 카드 찾기
        if (pokemonCard) {
            // 포켓몬 카드의 상태 토글 (보이거나 숨기기)
            if (pokemonCard.style.display === 'none' || pokemonCard.style.display === '') {
                pokemonCard.style.display = 'block';  // 보이게 설정
            } else {
                pokemonCard.style.display = 'none';  // 숨기게 설정
            }
        }
    });
});