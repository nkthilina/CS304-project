package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType,IDENTITY)
    @Column(name = "productID")
    private int productID;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productPrice")
    private float productPrice;

    @Column(name = "productDesc")
    private String productDesc;

    @Column(name = "productQuality")
    private int productQuality;


}
