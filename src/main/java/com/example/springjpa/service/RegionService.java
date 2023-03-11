package com.example.springjpa.service;

import com.example.springjpa.model.entity.Region;

import java.util.List;

public interface RegionService {

    List<Region> getAllRegion();
    Region getRegionById(Integer id);
}
