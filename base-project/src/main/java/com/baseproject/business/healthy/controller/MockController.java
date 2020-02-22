package com.baseproject.business.healthy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseproject.business.healthy.entity.MockEntity;

@RestController
public class MockController {

    @GetMapping("/checkHealthy")
    public ResponseEntity<Object> checkHealthy() {
        return new ResponseEntity<Object>(new MockEntity(1, "tienph"), HttpStatus.BAD_REQUEST);
    }
}
