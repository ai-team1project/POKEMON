package org.koreait.mobile.front.services;

import org.koreait.mobile.front.model.m_ProductSwiper;
import org.koreait.mobile.front.repositories.m_ProductSwiperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class m_ProductSwiperService {

    private final m_ProductSwiperRepository repository;

    @Autowired
    public m_ProductSwiperService(m_ProductSwiperRepository repository) {
        this.repository = repository;
    }

    public List<m_ProductSwiper> getEntities() {
        return repository.findAll();
    }

    public m_ProductSwiper saveEntity(m_ProductSwiper mproductSwiper) {
        return repository.save(mproductSwiper);
    }

    public m_ProductSwiper getEntityBySwiperText(String swiperText) {
        return repository.findById(swiperText).orElse(null);
    }
}