document.addEventListener('DOMContentLoaded', function () {
    console.log("agree.js loaded successfully!");

    // 토글 버튼 클릭 시 동작
    const toggleBtns = document.querySelectorAll('.toggle-btn');

    toggleBtns.forEach(function (btn) {
        btn.addEventListener('click', function () {
            const content = btn.nextElementSibling; // .terms-content
            const isVisible = content.style.display === 'block'; // 내용이 보이는지 체크

            if (isVisible) {
                content.style.display = 'none'; // 숨기기
                btn.classList.remove('open');    // 버튼 회전 없애기
            } else {
                content.style.display = 'block'; // 보이기
                btn.classList.add('open');       // 버튼 회전
            }
        });
    });

    // 전체 약관 동의 체크박스
    const checkAll = document.getElementById('check-all');
    if (checkAll) {
        checkAll.addEventListener('change', function () {
            const isChecked = checkAll.checked;
            const checkboxes = document.querySelectorAll('.terms');
            checkboxes.forEach(function (checkbox) {
                checkbox.checked = isChecked;
            });
        });
    }
});