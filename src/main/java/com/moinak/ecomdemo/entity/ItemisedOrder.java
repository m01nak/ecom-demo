package com.moinak.ecomdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ItemisedOrder {
    @Id
    long itemisedOrderId;
    long orderId;
    long productId;
    long product_quantity;
}
