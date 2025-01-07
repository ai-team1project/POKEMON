package org.koreait.mobile.front.controllers;

import org.koreait.mobile.front.model.m_ProductSwiper;
import org.koreait.mobile.front.services.m_ProductSwiperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/m.entities")
public class m_ProductSwiperController {

    private final m_ProductSwiperService service;

    @Autowired
    public m_ProductSwiperController(m_ProductSwiperService service) {
        this.service = service;
    }

    @GetMapping
    public List<m_ProductSwiper> getAllEntities() {
        return service.getEntities();
    }

    @PostMapping
    public m_ProductSwiper createEntity(@RequestBody m_ProductSwiper entity) {
        return service.saveEntity(entity);
    }

    @GetMapping("/{id}")
    public m_ProductSwiper getEntity(@PathVariable String swiperText) {
        return service.getEntityBySwiperText(swiperText);
    }


}