
    // 각 약관 내용의 토글 버튼을 클릭하면 해당 약관 내용 보이기/숨기기
    document.addEventListener("DOMContentLoaded", function() {
        const toggleBtns = document.querySelectorAll('.toggle-btn');

        toggleBtns.forEach(function(btn) {
            btn.addEventListener('click', function() {
                const contentDiv = this.nextElementSibling; // 토글 버튼 바로 다음에 있는 약관 내용 div
                contentDiv.classList.toggle('open'); // contentDiv의 'open' 클래스 토글
            });
        });

        // '전체 약관에 동의합니다' 체크박스 클릭 시 모든 약관 펼치기
        const checkAllBox = document.getElementById('check-all');
        const termCheckboxes = document.querySelectorAll('.terms');

        checkAllBox.addEventListener('change', function() {
            termCheckboxes.forEach(function(checkbox) {
                checkbox.checked = checkAllBox.checked;
                const contentDiv = checkbox.closest('li').querySelector('.terms-content');
                if (checkAllBox.checked) {
                    contentDiv.classList.add('open');
                } else {
                    contentDiv.classList.remove('open');
                }
            });
        });
    });

