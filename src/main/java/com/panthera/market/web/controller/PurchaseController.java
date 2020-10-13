package com.panthera.market.web.controller;


import com.panthera.market.domain.Purchase;
import com.panthera.market.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    @Autowired
    private final PurchaseService purchaseService;

    PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAll() {
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{Id}")
    public ResponseEntity<List<Purchase>> getByClient(@PathVariable("Id") String clientId) {
        return purchaseService.getByClient(clientId).map(purchase -> new ResponseEntity<>(purchase, HttpStatus.OK)).orElse(new ResponseEntity<>((HttpStatus.NOT_FOUND)));
    }

    @PostMapping("/save")
    public ResponseEntity<Purchase> save(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED);
    }
}
