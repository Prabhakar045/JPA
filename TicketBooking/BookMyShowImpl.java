package com.Xworkz.TicketBookingApplication.TicketBooking;

import com.Xworkz.TicketBookingApplication.dto.MovieTicketsDTO;
import sun.nio.cs.ext.MacArabic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookMyShowImpl implements BookMyShow{


    @Override
    public boolean addMovieaTicketInfo(MovieTicketsDTO dto) {

        //class
        Persistence persistence = new Persistence();

        //interface
        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("com.Xworkz");

        //interface
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        MovieTicketsDTO movieTicketsDTO=entityManager.find(MovieTicketsDTO.class , 1);
         entityManager.getTransaction().begin();

        entityManager.persist(dto);

        entityManager.getTransaction().commit();
        return false;
    }

    @Override
    public MovieTicketsDTO getBookingInfoId(int id) {

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.Xworkz");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        MovieTicketsDTO movieTicket = entityManager.find(MovieTicketsDTO.class, id);


        return new Persistence().createEntityManagerFactory("com.Xworkz").createEntityManager().find(MovieTicketsDTO.class, 1);


    }



}
