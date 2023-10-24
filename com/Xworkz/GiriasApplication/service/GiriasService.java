package com.Xworkz.GiriasApplication.service;

import com.Xworkz.GiriasApplication.dto.ProductDTO;

public interface GiriasService {

    public boolean validateProducrAndaddProduct(ProductDTO dto);

    public  ProductDTO getProductInfoId(int id);
//
//    public  void updatePriceByProductId(double updatedPrice, int productID);
//
//    public int deleteProcuctinfoById(int id);
}
