package com.sathwikProject.ecommerceApp.dao;

import com.sathwikProject.ecommerceApp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
