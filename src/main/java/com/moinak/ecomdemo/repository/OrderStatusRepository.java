package com.moinak.ecomdemo.repository;

import com.moinak.ecomdemo.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, String> {
    public OrderStatus findByOrderStatus(String OrderStatus);
}
