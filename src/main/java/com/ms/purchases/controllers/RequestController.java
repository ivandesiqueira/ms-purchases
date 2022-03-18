package com.ms.purchases.controllers;

import com.ms.purchases.models.Request;
import com.ms.purchases.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/requests")
public class RequestController {

    @Autowired
    RequestService requestService;

    @PostMapping
    public ResponseEntity<Request> salveRequest(@RequestBody @Valid Request request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(requestService.saveRequest(request));
    }
}