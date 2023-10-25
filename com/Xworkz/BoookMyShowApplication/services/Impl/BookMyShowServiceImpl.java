package com.Xworkz.BoookMyShowApplication.services.Impl;

import com.Xworkz.BoookMyShowApplication.dto.MovieTicketsDTO;
import com.Xworkz.BoookMyShowApplication.repository.BookMyShowRepository;
import com.Xworkz.BoookMyShowApplication.repository.Impl.BookMyShowRepositoryImpl;
import com.Xworkz.BoookMyShowApplication.services.BookMyShowService;

public class BookMyShowServiceImpl implements BookMyShowService {

    BookMyShowRepository bookMyShowRepository;

    public BookMyShowServiceImpl() {
        bookMyShowRepository = new BookMyShowRepositoryImpl();
    }

    @Override
    public boolean validateAddMovieTickets(MovieTicketsDTO dto) {
        System.out.println("Validation method invoked in service layer");

        boolean isMovieNameValidated = false;
        boolean isLanguageValidated = false;
        boolean isTheaterNameValidated = false;
        boolean isNoOFTicketsValidated = false;
        boolean isPriceValidated = false;

        if (dto != null) {
            if (dto.getMovieName() != null) {
                System.out.println("1");
                isMovieNameValidated = true;
            }
            if (dto.getLanguage() != null) {
                System.out.println("2");
                isLanguageValidated = true;
            }

            if (dto.getTheaterName() != null) {
                System.out.println("3");
                isTheaterNameValidated = true;
            }

            if (dto.getNoOfTickets() > 0) {
                System.out.println("4");
                isNoOFTicketsValidated = true;
            }

            if (dto.getPrice() > 0) {
                System.out.println("5");
                isPriceValidated = true;
            }
        }

        if (isMovieNameValidated && isLanguageValidated && isTheaterNameValidated && isNoOFTicketsValidated && isPriceValidated) {
            System.out.println("Validation of all fields in the service layer");
            bookMyShowRepository.addMovieTicket(dto);
            return true;
        }

        return false;
    }

    @Override
    public MovieTicketsDTO getMovieInfoById(int id) {
        System.out.println("Invoked get method of the service layer");

        MovieTicketsDTO dto = null;
        if (id > 0) {
            dto = bookMyShowRepository.getBookingInfoByID(id);
        }
        return dto;
    }
}
