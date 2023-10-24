package com.Xworkz.GiriasApplication.dto;


import com.Xworkz.GiriasApplication.Constant.Material;
import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;

@Entity
@Data

@Table(name = "girias_product")
public class ProductDTO {

    @Id
    @Column(name = "product_id")
    // increament the id , thi annotation given by JPA -> here hibernate helping to generate id
    @GenericGenerator(name = "ref", strategy =  "increment")
    @GeneratedValue(generator = "ref")
    private   int productId;

   // @Column(name="no_of_products")
//    private  int noOfProducts;

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
