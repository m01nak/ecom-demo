package com.moinak.ecomdemo.repository;

import com.moinak.ecomdemo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    public List<Order> findByOrderId(long orderId);
    public List<Order> findByUserId(long userId);
    public Order findByOrderIdAndUserId(long orderId, long userId);
}
