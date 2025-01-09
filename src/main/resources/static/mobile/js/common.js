// 메뉴 토글 버튼과 메뉴 리스트 요소 가져오기
const menuToggle = document.getElementById('menuToggle');
const mainMenu = document.getElementById('mainMenu');

// 버튼 클릭 시 메뉴 토글 및 버튼 모양 변경
menuToggle.addEventListener('click', function() {
    // 메뉴의 display 상태를 토글
    if (mainMenu.style.display === 'block') {
        mainMenu.style.display = 'none';
    } else {
        mainMenu.style.display = 'block';
    }

    // 버튼이 클릭될 때마다 'active' 클래스를 토글하여 버튼 모양 변경
    menuToggle.classList.toggle('active');
});
