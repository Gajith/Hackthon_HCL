package com.hackthon.demo.controller;

import com.hackthon.demo.exception.NotFoundException;
import com.hackthon.demo.jpa.Customer;
import com.hackthon.demo.model.PortfolioDto;
import com.hackthon.demo.model.UserDto;
import com.hackthon.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
public  class CustomerController {

    @Autowired
    private UserService customerService;

    public CustomerController(UserService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<?> findAll(@PathVariable long id)  {

        Customer user = null;
        try {
             user = customerService.get(id);
             return ResponseEntity.ok().body(user);
        } catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        }


    }


    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user) {

        return ResponseEntity.ok().body(customerService.create(user));
    }

   /* @PostMapping("/{id}")
    public ResponseEntity<UserDto> createPortfolio(@PathVariable long id,@RequestBody PortfolioDto user) {

        return ResponseEntity.ok().body(customerService.create(user));
    }*/








}