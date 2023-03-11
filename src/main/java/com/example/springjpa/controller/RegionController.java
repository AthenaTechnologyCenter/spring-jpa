package com.example.springjpa.controller;

import com.example.springjpa.model.entity.Region;
import com.example.springjpa.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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


}
