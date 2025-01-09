// JavaScript (script.js)
document.getElementById('menuToggle').addEventListener('click', function() {
    const menu = document.getElementById('mainMenu');

    // 메뉴가 숨겨져 있으면 보이도록, 보이면 숨기도록 토글
    menu.classList.toggle('open');
});
ㅎ