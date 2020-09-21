package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.service.ProductStockService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class ProductStockController
{
	@Autowired
	ProductStockService productStockService;
	public void setProductStockService(ProductStockService productStockService)
	{
		this.productStockService=productStockService;
	}
	@PostMapping("/productstock/manufacturingdate")
	public ResponseEntity<String> UpdateProductStock(@RequestBody ProductStock productstock) {
		ProductStock t = productStockService.updateProductStock(productstock);
		if (t == null) {
			
			return new ResponseEntity<String>("Update Operation Unsuccessful,Provided testId does not exist", new HttpHeaders(), HttpStatus.OK);
		
		} else {
			return new ResponseEntity<String>("Updated successfully", new HttpHeaders(), HttpStatus.OK);
		}
   }
	
   @PostMapping("/productstock/expirydate")
  	public ResponseEntity<String> UpdateProductStock2(@RequestBody ProductStock productstock) {
  		ProductStock t = productStockService.updateProductStock(productstock);
  		if (t == null) {
  			
  			return new ResponseEntity<String>("Update Operation Unsuccessful,Provided testId does not exist", new HttpHeaders(), HttpStatus.OK);
  		
  		} else {
  			return new ResponseEntity<String>("Updated successfully", new HttpHeaders(), HttpStatus.OK);
  		}
     }	
}