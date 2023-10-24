package com.Xworkz.GiriasApplication.repository.impl;

import com.Xworkz.GiriasApplication.repository.GiriasRepository;
import com.Xworkz.GiriasApplication.dto.ProductDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GiriasRepositoryImpl implements GiriasRepository {
    @Override
    public boolean addProduct(ProductDTO dto) {
        // Create an EntityManagerFactory using the correct persistence unit name
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.pk");

        // Create an EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin a transaction
        entityManager.getTransaction().begin();

        // Persist the ProductDTO entity
        entityManager.persist(dto);

        // Commit the transaction
        entityManager.getTransaction().commit();

        // Close the EntityManager and EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();

        return true;
    }

    @Override
    public ProductDTO getProductInfoId(int id) {
        System.out.println("invoked getProductInfoId of Repository layer");
        return new Persistence().createEntityManagerFactory("com.pk").createEntityManager().find(ProductDTO.class, id);

    }

    @Override
    public void updatePriceByProductId(double updatedPrice, int productID) {

        EntityManager entityManager=new Persistence().createEntityManagerFactory("com.pk").createEntityManager();

        ProductDTO dto = entityManager.find(ProductDTO.class, productID);

        if (dto != null){
            dto.setPrice(updatedPrice);
            entityManager.getTransaction().begin();
            entityManager.merge(dto);
            entityManager.getTransaction().commit();

            System.out.println("Price of product is successfully updated");
        }
    }

    @Override
    public int deleteProcuctinfoById(int id) {

        EntityManager entityManager=new Persistence().createEntityManagerFactory("com.pk").createEntityManager();

        ProductDTO dto = entityManager.find(ProductDTO.class, 1);

        if (dto != null){
            entityManager.getTransaction().begin();
            entityManager.remove(dto);
            entityManager.getTransaction().commit();

            System.out.println("Price of product is successfully deleted");
        }
        return id;
    }


}
