package com.panthera.market.web.controller;

import com.panthera.market.domain.Product;
import com.panthera.market.domain.service.ProductService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private final ProductService productService;


    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    @ApiOperation("Get all supermarket products 11/06/2020")
    @ApiResponse(code = 200, message = "ok")
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{Id}")
    @ApiOperation("Get a product by Id")
    @ApiResponses(
            {
                    @ApiResponse(code = 200, message = "Ok"),
                    @ApiResponse(code = 404, message = "Product not found")
            })
    public ResponseEntity<Product> getProduct(@ApiParam(value = "The id of the product", required = true, example = "7") @PathVariable("Id") int productId) {
        return productService.getProduct(productId).map(product -> new ResponseEntity<>(product, HttpStatus.OK)).orElse(new ResponseEntity<>((HttpStatus.NOT_FOUND)));
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Product>> getByCategory(@PathVariable("categoryId") int categoryId) {
        return productService.getByCategory(categoryId).map(products -> new ResponseEntity<>(products, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<Void> delete(@PathVariable("Id") int productId) {
        if (productService.delete(productId)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
