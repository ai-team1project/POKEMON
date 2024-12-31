package org.koreait.front.controllers;

import org.koreait.front.common.BaseModel;
import org.koreait.front.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/goods")
    public String product(Model model) {

        List<BaseModel> productNewsList = new ArrayList<>();
        productNewsList.add(new BaseModel("해피햅삐 잠만보 이모티콘 출시!!", "2024년 07월 31일", "https://data1.pokemonkorea.co.kr/newdata/2024/07/2024-07-31_12-01-55-44458-1722394915.png", "https://e.kakao.com/t/happy-happyyy-jammanbo?lang=ko&referer=co_mkt"));
        model.addAttribute("productNewsList", productNewsList);

        List<Product>productGoodsList = new ArrayList<>();
        productGoodsList.add(new Product("[성수미술관] 포켓몬 도안", "식품 및 기타", "https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-21_13-47-51-31339-1732164471.jpg", "https://pokemonkorea.co.kr/goods/view/15455"));
        model.addAttribute("productGoodsList", productGoodsList);

        return "front/product/product";
    }
}