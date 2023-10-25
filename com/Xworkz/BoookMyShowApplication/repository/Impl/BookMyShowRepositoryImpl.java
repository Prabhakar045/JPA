package com.Xworkz.BoookMyShowApplication.repository.Impl;

import com.Xworkz.BoookMyShowApplication.dto.MovieTicketsDTO;
import com.Xworkz.BoookMyShowApplication.repository.BookMyShowRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookMyShowRepositoryImpl implements BookMyShowRepository {

    @Override
    public boolean addMovieTicket(MovieTicketsDTO dto) {
        System.out.println("addMovie method invoked");
        Persistence persistence = new Persistence();
        EntityManagerFactory entityManagerFactory =persistence.createEntityManagerFactory("com.pbk");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        return false;
    }

    @Override
    public MovieTicketsDTO getBookingInfoByID(int id) {
        System.out.println("get method invoked ");

        return new Persistence().createEntityManagerFactory("com.pbkk").createEntityManager().find(MovieTicketsDTO.class, id);
    }
}
