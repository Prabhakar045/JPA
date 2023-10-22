package com.Xworkz.GiriasApplication.GiriasApp;

import com.Xworkz.GiriasApplication.dto.ProductDTO;

public interface Girias {

    boolean addProduct(ProductDTO dto);

    public  ProductDTO getProductInfoId(int id);

    public  void updatePriceByProductId(double updatedPrice, int productID);

    public int deleteProcuctinfoById(int id);
}
