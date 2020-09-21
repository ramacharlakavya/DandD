package com.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



public class RawMaterialController {
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
