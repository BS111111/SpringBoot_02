package com.rt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rt.Entity.ProductEntity;

public interface ProductDao extends JpaRepository<ProductEntity, Integer> {

}
