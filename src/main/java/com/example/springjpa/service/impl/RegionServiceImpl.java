package com.example.springjpa.service.impl;

import com.example.springjpa.model.entity.Region;
import com.example.springjpa.model.response.ProvinceResponse;
import com.example.springjpa.repository.RegionRepository;
import com.example.springjpa.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    RegionRepository repository;

    @Override
    public List<Region> getAllRegion() {
        return repository.findAll();
    }

    @Override
    public Region getRegionById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Region> findByName(String name) {
        return repository.findRegionCustomize2(name);
    }

    @Override
    public List<ProvinceResponse> getAllProvinceWithRegion() {
        return repository.getAllProvinceWithRegion();
    }
}
