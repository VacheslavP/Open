package com.example.open.controllers;

import com.example.open.models.dto.Place;
import com.example.open.models.dto.Cat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/")
@Api(value = "Название контроллера")
public class CatController {

    @GetMapping("cat")
    @ApiOperation("получить кота Ваську")
    @ApiResponse(code = 200, message = "ok")
    public ResponseEntity<Cat> getCat () {
        Cat cat = new Cat("Васька", new BigDecimal("2.5"), new Place("Москва"));
        return new ResponseEntity<>(cat, HttpStatus.OK);
    }
}
