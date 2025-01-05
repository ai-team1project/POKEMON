document.addEventListener("DOMContentLoaded", function() {
    // 모든 toggle 버튼에 대한 클릭 이벤트 처리
    const toggleBtns = document.querySelectorAll('.toggle-btn');

    toggleBtns.forEach(function(btn) {
        btn.addEventListener('click', function() {
            const contentDiv = this.nextElementSibling; // 버튼 바로 뒤에 있는 약관 내용 div
            contentDiv.classList.toggle('open'); // 내용 토글

            // 화살표 방향 토글
            this.classList.toggle('open');
        });
    });
});
