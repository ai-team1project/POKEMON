package org.koreait.mobile.front.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class m_Game {
    private String gameTitle;
    private String gameSubTitle;
    private String gameImageUrl;
    private String gamePageUrl;

}