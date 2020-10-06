package com.panthera.market.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootTest(classes = {PantheraMarketApplication.class})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
class PantheraMarketApplicationTests {

    @Test
    void contextLoads() {
        String[] args = {};
        PantheraMarketApplication.main(args);
    }

}
