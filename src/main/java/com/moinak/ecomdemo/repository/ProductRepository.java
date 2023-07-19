package com.moinak.ecomdemo.repository;

import com.moinak.ecomdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findByProductId(long productId);
    public Product findByProductName(String productName);
}
