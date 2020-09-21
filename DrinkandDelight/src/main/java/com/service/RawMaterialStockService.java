package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RawMaterialDAO;


@Service
public class RawMaterialStockService<rmsdao> {
	@Autowired
	RawMaterialDAO rmsdao;
	public void setpsdao(RawMaterialDAO rmsdao) { this.rmsdao=rmsdao;}
}