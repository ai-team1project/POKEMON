package org.koreait.front.controllers;

import org.koreait.front.model.ProductSwiper;
import org.koreait.front.services.ProductSwiperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entities")
public class ProductSwiperController {

    private final ProductSwiperService service;

    @Autowired
    public ProductSwiperController(ProductSwiperService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductSwiper> getAllEntities() {
        return service.getEntities();
    }

    @PostMapping
    public ProductSwiper createEntity(@RequestBody ProductSwiper entity) {
        return service.saveEntity(entity);
    }

    @GetMapping("/{id}")
    public ProductSwiper getEntity(@PathVariable String swiperText) {
        return service.getEntityBySwiperText(swiperText);
    }


}