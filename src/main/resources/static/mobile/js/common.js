document.getElementById('menuToggle').addEventListener('click', function() {
    var menu = document.getElementById('mainMenu');
    var menuToggleButton = document.getElementById('menuToggle');

    // 메뉴 열기/닫기
    menu.classList.toggle('open');

    // 아이콘 변경
    if (menu.classList.contains('open')) {
        menuToggleButton.innerHTML = '&times;';  // X로 변경
    } else {
        menuToggleButton.innerHTML = '☰';  // ☰로 변경
    }
});
