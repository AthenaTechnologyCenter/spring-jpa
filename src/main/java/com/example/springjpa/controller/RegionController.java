package com.example.springjpa.controller;

import com.example.springjpa.model.entity.Region;
import com.example.springjpa.model.response.ProvinceResponse;
import com.example.springjpa.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {

    @Autowired
    RegionService service;

    @GetMapping
    public List<Region> getAll() {
        return service.getAllRegion();
    }

    @GetMapping("/search")
    public List<Region> getAllByName(@RequestParam("name") String name) {
        return service.findByName(name);
    }

    @GetMapping("/province")
    public List<ProvinceResponse> getAllProvinceWithRegion() {
        return service.getAllProvinceWithRegion();
    }
}
