package org.koreait.mobile.main.entitise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class m_MainGame {
    private String gameImage; // 게임 메인 이미지
    private String title; // 제목
    private String imageUrl; // 이미지
    private String pageUrl; // 이동하는 a 태그 같은
}