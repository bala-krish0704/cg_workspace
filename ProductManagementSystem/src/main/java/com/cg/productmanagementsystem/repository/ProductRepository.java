package com.cg.productmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.productmanagementsystem.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
