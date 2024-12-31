package org.koreait.front.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductSwiper {

    @Id
    private String swiperText;

    private String swiperImageUrl;

    private String swiperPageUrl;
}