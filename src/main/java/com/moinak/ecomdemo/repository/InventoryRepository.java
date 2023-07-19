package com.moinak.ecomdemo.repository;

import com.moinak.ecomdemo.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    public Inventory findByProductId(long productId);
}
