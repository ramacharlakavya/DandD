package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dto.ProductStock;



@Repository
public interface RawMaterialDAO extends JpaRepository<ProductStock,Integer>
{

}