package com.panthera.market;

import com.panthera.market.PantheraMarketApplication;
import com.panthera.market.domain.service.ProductService;
import com.panthera.market.persistence.crud.CompraCrudRepository;
import com.panthera.market.persistence.crud.ProductoCrudRepository;
import com.panthera.market.persistence.mapper.ProductMapper;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {PantheraMarketApplication.class})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
class PantheraMarketApplicationTests {

    @MockBean
    private ProductoCrudRepository productoCrudRepository;

    @MockBean
    private CompraCrudRepository compraCrudRepository;

    @Test
    void contextLoads() {
        assertEquals("banner.txt", SpringApplication.BANNER_LOCATION_PROPERTY_VALUE, "BANNER_LOCATION_PROPERTY_VALUE should be banner.txt");

    }

}
