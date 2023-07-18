package com.moinak.ecomdemo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ItemisedOrder {

    long orderId;
    long productId;
    long product_quantity;

}
