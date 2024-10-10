package com.example.demo.generictype.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BookController {

    @PostMapping("/book")
    public String postRequest(@Valid @RequestBody BookRequest bookRequest) {

        return bookRequest.toString();
    }
}
