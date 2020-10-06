package com.panthera.market.web.controller;

import com.panthera.market.web.controller.PantheraMarketApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {PantheraMarketApplication.class})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
class PantheraMarketApplicationTests {

    @Test
    void contextLoads() {
    }

}
