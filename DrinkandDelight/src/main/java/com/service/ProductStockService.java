package com.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductStockDAO;
import com.dto.ProductStock;


@Service
public class ProductStockService {
	@Autowired
    ProductStockDAO psdao;
	public void setpsdao(ProductStockDAO psdao) { this.psdao=psdao;}
	public ProductStock updateProductStock(ProductStock productstock) {
		// TODO Auto-generated method stub
		return null;
	}
}