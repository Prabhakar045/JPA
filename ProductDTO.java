package com.Xworkz.GiriasApplication.dto;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity

@Table(name = "girias_product")
public class ProductDTO {

    @Id
    @Column(name = "product_id")
    private   int productId;
    @Column(name= "product_name")
    private  String productName;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "color")
    private String color;
    @Column(name = "material")
    private String material;
    @Column(name  = "manufacturer")
    private  String manufacturer;
    @Column(name= "price")
    private double price;
    @Column(name="warranty")
    private  String warranty ;
}
