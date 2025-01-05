document.addEventListener('DOMContentLoaded', function () {
            const filterButtons = document.querySelectorAll('.category');
            const newsItems = document.querySelectorAll('.news-item');

            // 필터 버튼 클릭 이벤트
            filterButtons.forEach(button => {
                button.addEventListener('click', function () {
                    // 모든 버튼에서 active 클래스 제거
                    filterButtons.forEach(btn => btn.classList.remove('active'));
                    // 클릭한 버튼에 active 클래스 추가
                    this.classList.add('active');
                    const category = this.getAttribute('data-category');

                    // 뉴스 항목 필터링
                    newsItems.forEach(item => {
                        const itemCategory = item.getAttribute('data-category');

                        if (category === 'all' || itemCategory.includes(category)) {
                            item.style.display = 'block'; // 카드를 표시
                        } else {
                            item.style.display = 'none'; // 카드를 숨김
                        }
                    });
                });
            });
        });