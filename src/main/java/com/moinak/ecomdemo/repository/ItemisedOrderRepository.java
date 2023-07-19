package com.moinak.ecomdemo.repository;

import com.moinak.ecomdemo.entity.ItemisedOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemisedOrderRepository extends JpaRepository<ItemisedOrder,Long> {
    public ItemisedOrder findByItemisedOrderId(long itemisedOrderId);
    public List<ItemisedOrder> findByOrderId(long orderId);
    public List<ItemisedOrder> findByUserId(long userId);
    public List<ItemisedOrder> findByProductId(long productId);
}
