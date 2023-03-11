package com.example.springjpa.controller;

import com.example.springjpa.model.response.ProductResponse;
import com.example.springjpa.model.request.ProductRequest;
import com.example.springjpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

//    @Autowired
//    private ProductService service;
//
//    @PostMapping
//    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
//        return ResponseEntity.ok(service.create(productRequest));
//    }

}
