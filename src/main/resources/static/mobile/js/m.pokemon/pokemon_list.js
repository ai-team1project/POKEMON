const typeColors = {
        "풀": "#42bf25",
        "독": "#994ecf",
        "불꽃": "#fe612c",
        "비행": "#96c9ff",
        "드래곤": "#5562d5",
        "물": "#2992ff",
        "벌레": "#9fa424",
        "노말": "#999999",
        "악": "#4f4647",
        "전기": "#ffdb00",
        "에스퍼": "#ff6380",
        "땅": "#ab793a",
        "얼음": "#43d8ff",
        "강철": "#6aaed3",
        "페어리": "#ffb0ff",
        "격투": "#ffa202",
        "바위": "#bcb889",
        "고스트": "#6e4571"
    };

// 모든 .type 요소에 대해 배경색 설정
document.querySelectorAll('.type').forEach(function (element) {
    const typeText = element.textContent.trim();  // 텍스트 내용 가져오기
    if (typeColors[typeText]) {
        element.style.backgroundColor = typeColors[typeText];  // 해당 타입의 배경색 적용
    }
});

