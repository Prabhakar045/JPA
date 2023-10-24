package com.Xworkz.GiriasApplication;

import com.Xworkz.GiriasApplication.Constant.Material;
import com.Xworkz.GiriasApplication.dto.ProductDTO;
import com.Xworkz.GiriasApplication.service.GiriasService;
import com.Xworkz.GiriasApplication.service.impl.GiriasServiceImpl;

import java.util.Scanner;

public class GiriasTester {

    public static void main(String[] args) {
        GiriasService giriasService = new GiriasServiceImpl();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products to add: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {

            sc.nextLine();
            System.out.println("Product details for Product " + (i + 1) + ":");

            System.out.print("Product Name: ");
            String productName = sc.nextLine();

            System.out.print("Brand Name: ");
            String brandName = sc.nextLine();

            System.out.print("Color: ");
            String color = sc.nextLine();

            System.out.print("Material: ");
            String material = sc.nextLine();

            System.out.print("Manufacturer: ");
            String manufacturer = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            sc.nextLine();

            System.out.print("Warranty: ");
            String warranty = sc.nextLine();

            ProductDTO productDTO = new ProductDTO();
            productDTO.setProductName(productName);
            productDTO.setBrandName(brandName);
            productDTO.setColor(color);
            productDTO.setMaterial(material);
            productDTO.setManufacturer(manufacturer);
            productDTO.setPrice(price);
            productDTO.setWarranty(warranty);


            boolean result = giriasService.validateProducrAndaddProduct(productDTO);

            if (result) {
                System.out.println("Product added  ");
            } else {
                System.out.println(" Product not added   ");
            }


        }


        System.out.print("Enter the ID of the product to get product information : ");
        int productId1 = sc.nextInt();
        ProductDTO retrievedData = giriasService.getProductInfoId(productId1);

        if (retrievedData != null) {
            System.out.println(" Products detailsss ");
            System.out.println(retrievedData);
        } else {
            System.out.println("not found movie this for this id: ");
        }

  /*
        System.out.print("enter Product id to update price: ");
        int productID = sc.nextInt();

        System.out.print("Enter the updated price: ");
        double updatedPrice = sc.nextDouble();

        giri.updatePriceByProductId(updatedPrice, productID);


        System.out.println("Enter product Id to delete product info");
        int pId = sc.nextInt();
        int deletedProduct = giri.deleteProcuctinfoById(pId);
        System.out.println(deletedProduct);

         */
    }
}
