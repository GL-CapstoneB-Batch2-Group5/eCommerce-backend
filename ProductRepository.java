package com.ShopForHome.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ShopForHome.ecommerce.entity.product;

public interface ProductRepository extends JpaRepository<product,Long>{
	
}
