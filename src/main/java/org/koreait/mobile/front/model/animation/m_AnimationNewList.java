package org.koreait.mobile.front.model.animation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class m_AnimationNewList {
    private String title; // 제목
    private String sub_title; // 밑에 정보
    private String imageUrl; // 이미지
    private String pageUrl; // 이동하는 a 태그 같은
    private String sub_image;
    private String next_title; // 그 다음 정보
}