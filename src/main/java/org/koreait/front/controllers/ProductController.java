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
        model.addAttribute("productNewsList", productNewsList);

        List<Product>productGoodsList = new ArrayList<>();
        model.addAttribute("productGoodsList", productGoodsList);

        return "front/product/product";
    }
}