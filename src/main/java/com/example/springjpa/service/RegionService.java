package com.example.springjpa.service;

import com.example.springjpa.model.entity.Region;
import com.example.springjpa.model.response.ProvinceResponse;

import java.util.List;

public interface RegionService {

    List<Region> getAllRegion();
    Region getRegionById(Integer id);
    List<Region> findByName(String name);
    List<ProvinceResponse> getAllProvinceWithRegion();
}
