package com.Xworkz.IRCTCApplication.IRCTCAPP;

import com.Xworkz.IRCTCApplication.dto.TravellerDto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IrctcImpl implements Irctc {

    @Override
    public boolean bookTicket(TravellerDto dto) {
        EntityManager entityManager = null;
        EntityManagerFactory entityManagerFactory = null;
        try {
            Persistence persistence = new Persistence();
            entityManagerFactory = persistence.createEntityManagerFactory("com.pbk");
            entityManager = entityManagerFactory.createEntityManager();

            // Start a transaction
            entityManager.getTransaction().begin();

            // Perform the database operation
            entityManager.persist(dto);

            // Commit the transaction
            entityManager.getTransaction().commit();

            return true; // Booking was successful
        } catch (Exception e) {
            e.printStackTrace();

            return false; // Booking failed
        } finally {

            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
            if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
                entityManagerFactory.close();
            }
        }
    }
}
