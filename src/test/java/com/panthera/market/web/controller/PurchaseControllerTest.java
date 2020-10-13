package com.panthera.market.web.controller;


import com.panthera.market.domain.Purchase;
import com.panthera.market.domain.service.PurchaseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseControllerTest {

    @Autowired
    private PurchaseService purchaseService;

    PurchaseController tester;


    @BeforeEach
    void initEach() {
        // Arrange
        purchaseService = Mockito.mock(PurchaseService.class);
        tester = new PurchaseController(purchaseService);
    }

    @Test
    void getAll() {
        assertEquals(new ResponseEntity<>(new ArrayList<Purchase>(), HttpStatus.OK), tester.getAll(), "getAll must be OK");
    }


    @Test
    void getByClientNotFound() {
        assertEquals(new ResponseEntity<>(HttpStatus.NOT_FOUND), tester.getByClient("123"), "getByClient('123') must be NOT_FOUND");
    }

    @Test
    void getByClientOk() {

        List<Purchase> purchase = new ArrayList<>();
        Optional<List<Purchase>> optionalPurchases = Optional.of(purchase);
        Mockito.when(purchaseService.getByClient("123")).thenReturn(optionalPurchases);

        assertEquals(new ResponseEntity<>(purchase, HttpStatus.OK), tester.getByClient("123"), "getProduct('123') must be Ok");
    }

    @Test
    void save() {
        assertEquals(new ResponseEntity<>(HttpStatus.CREATED), tester.save(new Purchase()), "save must be an instance of CREATED");
    }

}
