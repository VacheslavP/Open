package com.example.open.controller;

import com.example.open.model.dto.Place;
import com.example.open.model.dto.Cat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/")
public class CatController {

    @GetMapping("cat")
    public ResponseEntity<Cat> getCat () {
        Cat cat = new Cat("Васька", new BigDecimal("2.5"), new Place("Москва"));
        return new ResponseEntity<>(cat, HttpStatus.OK);
    }
}
