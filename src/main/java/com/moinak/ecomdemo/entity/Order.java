package com.moinak.ecomdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long orderId;
    long userId;
    Date orderCreatedDtm;
    Date orderClosedDtm;
    String orderStatus;
}
