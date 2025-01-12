document.addEventListener("DOMContentLoaded", function () {
        const toggleBtn = document.querySelector(".toggle-btn");
        const flavorText = document.querySelector(".flavor-text");

        // "정보 더보기" 버튼 클릭 시, 텍스트 토글
        toggleBtn.addEventListener("click", function () {
            if (flavorText.classList.contains("short")) {
                flavorText.classList.remove("short");
                toggleBtn.textContent = "정보 숨기기";  // 버튼 텍스트 변경
            } else {
                flavorText.classList.add("short");
                toggleBtn.textContent = "정보 더보기";  // 버튼 텍스트 변경
            }
        });
    });