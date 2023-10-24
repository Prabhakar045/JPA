package com.Xworkz.GiriasApplication.service.impl;

import com.Xworkz.GiriasApplication.dto.ProductDTO;
import com.Xworkz.GiriasApplication.repository.GiriasRepository;
import com.Xworkz.GiriasApplication.repository.impl.GiriasRepositoryImpl;
import com.Xworkz.GiriasApplication.service.GiriasService;

public class GiriasServiceImpl implements GiriasService {


    GiriasRepository giriasRepository;

    public  GiriasServiceImpl(){

        giriasRepository= new GiriasRepositoryImpl();
    }

    @Override
    public boolean validateProducrAndaddProduct(ProductDTO dto) {
        System.out.println("Welcome to validation method of service layer ... ");

        boolean isPriceValidated =false;
        boolean isProductNameValidated = false;
        boolean isProductBrandvalidated = false;
        boolean isColorValidated = false ;
        boolean isMaterialvalidated = false;
        boolean isManufacturerValidated = false;
        boolean isWarrantyValited = false ;


        if (dto  != null){

            /*if(dto.getNoOfProducts() > 0 ) {
                isPriceValidated = true;
            } */

            if(dto.getPrice() > 0 ) {
                isPriceValidated = true;
            }

            if(dto.getProductName()  != null ) {
                isProductNameValidated = true;
            }

            if(dto.getBrandName() != null){
                isProductBrandvalidated = true;
            }
            if (dto.getColor() != null){
                isColorValidated = true;
            }
            if (dto.getMaterial() != null){
                isMaterialvalidated = true ;
            }
            if (dto.getManufacturer() != null){
                isManufacturerValidated = true;
            }

            if (dto.getWarranty() != null){
                isWarrantyValited = true;
            }
        }

        if (isPriceValidated == true &&  isProductNameValidated == true && isProductBrandvalidated == true && isColorValidated == true && isMaterialvalidated == true && isManufacturerValidated== true && isWarrantyValited ==  true  ) {

            System.out.println("validated all the fields add product repository ..");
            giriasRepository.addProduct(dto);
            return true;
        }


        System.out.println("procttttttttttttt");
        return true;
    }





    @Override
    public ProductDTO getProductInfoId(int id) {
        System.out.println("Invoked getProductInfoId of Service layer ");

        ProductDTO  dto = null;
        if( id > 0){
            dto = giriasRepository.getProductInfoId(id);
        }
        return dto;

    }
//
//    @Override
//    public void updatePriceByProductId(double updatedPrice, int productID) {
//
//        EntityManager entityManager=new Persistence().createEntityManagerFactory("com.pk").createEntityManager();
//
//        ProductDTO dto = entityManager.find(ProductDTO.class,productID);
//
//        if (dto != null){
//            dto.setPrice(updatedPrice);
//            entityManager.getTransaction().begin();
//            entityManager.merge(dto);
//            entityManager.getTransaction().commit();
//
//            System.out.println("Price of product is successfully updated");
//        }
//    }
//
//    @Override
//    public int deleteProcuctinfoById(int id) {
//
//        EntityManager entityManager=new Persistence().createEntityManagerFactory("com.pk").createEntityManager();
//
//        ProductDTO dto = entityManager.find(ProductDTO.class, 1);
//
//        if (dto != null){
//            entityManager.getTransaction().begin();
//            entityManager.remove(dto);
//            entityManager.getTransaction().commit();
//
//            System.out.println("Price of product is successfully deleted");
//        }
//        return id;
//    }


}
