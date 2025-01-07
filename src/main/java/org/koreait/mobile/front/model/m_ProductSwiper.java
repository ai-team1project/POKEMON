package org.koreait.mobile.front.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class m_ProductSwiper {

    @Id
    private String swiperText;

    private String swiperImageUrl;

    private String swiperPageUrl;
}