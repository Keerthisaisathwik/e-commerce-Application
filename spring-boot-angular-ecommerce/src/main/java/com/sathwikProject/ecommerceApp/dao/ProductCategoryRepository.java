package com.sathwikProject.ecommerceApp.dao;

import com.sathwikProject.ecommerceApp.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
//productCategory == name of JSON entry
//product-category == file name
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
