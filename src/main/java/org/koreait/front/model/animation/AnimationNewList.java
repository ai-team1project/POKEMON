package org.koreait.front.model.animation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimationNewList {
    private String title; // 제목
    private String sub_title; // 밑에 정보
    private String imageUrl; // 이미지
    private String pageUrl; // 이동하는 a 태그 같은
    private String sub_image;
}