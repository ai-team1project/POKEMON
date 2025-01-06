package org.koreait.mobile.front.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class m_Product {
    private String productTitle;
    private String productSubTitle;
    private String productImageUrl;
    private String productPageUrl;
}