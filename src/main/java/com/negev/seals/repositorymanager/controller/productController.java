package com.negev.seals.repositorymanager.controller;


import com.negev.seals.repositorymanager.beans.Product;
import com.negev.seals.repositorymanager.dataobjectaccess.ProductDAO;
import com.negev.seals.repositorymanager.dataobjectaccess.ProductDAOHashTable;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class productController {

    @Autowired
    private ProductDAO productDao;

    @RequestMapping(method = RequestMethod.GET, value = "/product", path = "/product")
    @ApiOperation(value = "getProduct", notes="get product",nickname = "getProduct")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Server error"),
            @ApiResponse(code = 404, message = "Service not found"),
            @ApiResponse(code = 200, message = "Successful retrieval",
                    response = Product.class, responseContainer = "Entity") })
    public Product getProductByName(@ApiParam(value = "product name",
            required = true)@RequestParam(value = "name") String name)
    {
        return productDao.getProductByName(name);
    }

    @PostMapping(path= "/product", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
         productDao.addProduct(product);
         return new ResponseEntity<String>("POST Response", HttpStatus.OK);
    }

    @PostMapping(path= "/deleteproduct", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> deleteProduct(@RequestBody Product product) {
        productDao.deleteProduct(product);
        return new ResponseEntity<String>("POST Response", HttpStatus.OK);
    }

    @PostMapping(path= "/updateproduct", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> updateProduct(@RequestBody Product product) {
        productDao.updateProduct(product);
        return new ResponseEntity<String>("POST Response", HttpStatus.OK);
    }

    public void setProductDao(ProductDAO productDao) {
        this.productDao = productDao;
    }
}
