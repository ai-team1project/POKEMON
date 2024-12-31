package org.koreait.front.services;

import org.koreait.front.model.ProductSwiper;
import org.koreait.front.repositories.ProductSwiperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSwiperService {

    private final ProductSwiperRepository repository;

    @Autowired
    public ProductSwiperService(ProductSwiperRepository repository) {
        this.repository = repository;
    }

    public List<ProductSwiper> getEntities() {
        return repository.findAll();
    }

    public ProductSwiper saveEntity(ProductSwiper productSwiper) {
        return repository.save(productSwiper);
    }

    public ProductSwiper getEntityBySwiperText(String swiperText) {
        return repository.findById(swiperText).orElse(null);
    }
}