package com.example.baedal.service;

import com.example.baedal.dto.response.ResponseDto;
import com.example.baedal.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
@EnableCaching
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;


    @Transactional
    @Cacheable(value = "test")
    public ResponseDto<?> getAllStore() {

        return ResponseDto.success(storeRepository.findAll());
    }
}
