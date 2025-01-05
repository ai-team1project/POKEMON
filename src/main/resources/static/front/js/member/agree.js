// scripts/terms-toggle.js

document.addEventListener('DOMContentLoaded', function() {
    // 토글 버튼 클릭 시
    const toggleBtns = document.querySelectorAll('.toggle-btn');

    toggleBtns.forEach(function(btn) {
        btn.addEventListener('click', function() {
            const content = btn.nextElementSibling;  // .terms-content
            const isVisible = content.style.display === 'block';  // 내용이 보이는지 체크

            if (isVisible) {
                content.style.display = 'none';  // 숨기기
                btn.classList.remove('open');    // 버튼 회전 없애기
            } else {
                content.style.display = 'block'; // 보이기
                btn.classList.add('open');       // 버튼 회전
            }
        });
    });

    // "전체 동의" 체크박스가 클릭될 때, 모든 체크박스 상태는 그대로 유지하고 '전체 동의'만 선택/해제
    const checkAll = document.getElementById('check-all');
    if (checkAll) {
        checkAll.addEventListener('change', function() {
            // "전체 동의" 체크박스 상태만을 반영하도록 설정
            const isChecked = checkAll.checked;
            // individual checkboxes 상태는 그대로 두고 "전체 동의"만 체크된 상태로 유지
            const checkboxes = document.querySelectorAll('.terms');
            checkboxes.forEach(function(checkbox) {
                if (checkbox.checked !== isChecked) {
                    // 상태만 반영, 초기화 하지 않음
                    checkbox.checked = isChecked;
                }
            });
        });
    }
});
