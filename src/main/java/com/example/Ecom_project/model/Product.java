package com.example.Ecom_project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name, description, brand,category;
    private BigInteger price;
    private Date releaseDate;
    private boolean productAvailable;
    private int stock;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

}
