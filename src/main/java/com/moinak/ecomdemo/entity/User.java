package com.moinak.ecomdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long userId;
    @Column(unique = true)
    String userEmail;
    @Column(unique = true)
    String userPhone;
    String userFirstName;
    String userLastName;
    String userPassword;
}
