package com.panthera.market.domain.service;


import com.panthera.market.domain.Purchase;
import com.panthera.market.domain.repository.PurchaseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PurchaseServiceTest {

    @Autowired
    private PurchaseRepository purchaseRepository;

    PurchaseService tester;

    @BeforeEach
    void initEach() {
        // Arrange
        purchaseRepository = Mockito.mock(PurchaseRepository.class);
        tester = new PurchaseService(purchaseRepository);
    }

    @Test
    void getAll() {
        assertEquals(tester.getAll(), new ArrayList<>(), "getAll must be []");
    }

    @Test
    void getProduct() {
        assertEquals(tester.getByClient("23452"), Optional.empty(), "getByClient('23452') must be Optional.empty()");
    }

    @Test
    void save() {
        assertNull(tester.save(new Purchase()), "save must be Null");
    }
}
