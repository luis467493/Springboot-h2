package com.test.controller;

import com.test.dto.Input;
import com.test.service.CharAnalysis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Char {

    @Autowired
    private CharAnalysis charAnalysis;

    @PostMapping("/chars/")
    public ResponseEntity analyseChar(@RequestBody Input input) {
        ResponseEntity responseEntity;
        try {
            responseEntity = new ResponseEntity(charAnalysis.analyseChar(input), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new ResponseEntity("Something failed processing the input!", HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
}
