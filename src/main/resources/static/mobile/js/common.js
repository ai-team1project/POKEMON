// 토글 메뉴 기능
function toggleMenu() {
    const menu = document.querySelector('.main-menu');
    const toggleBtn = document.querySelector('.toggle-btn');

    // 메뉴 열고 닫기
    menu.classList.toggle('open');

    // 버튼 아이콘 변경 (햄버거 <-> X 아이콘)
    toggleBtn.classList.toggle('active');
}
