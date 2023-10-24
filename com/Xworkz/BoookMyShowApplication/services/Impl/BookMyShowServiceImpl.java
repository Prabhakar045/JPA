package com.Xworkz.BoookMyShowApplication.services.Impl;

import com.Xworkz.BoookMyShowApplication.dto.MovieTicketsDTO;
import com.Xworkz.BoookMyShowApplication.repository.BookMyShowRepository;
import com.Xworkz.BoookMyShowApplication.repository.Impl.BookMyShowRepositoryImpl;
import com.Xworkz.BoookMyShowApplication.services.BookMyShowService;

public class BookMyShowServiceImpl  implements BookMyShowService {

    BookMyShowRepository bookMyShowRepository;

    public BookMyShowServiceImpl(){

        bookMyShowRepository = new BookMyShowRepositoryImpl();
    }

    boolean isMovieNameValidated = false ;
    boolean isLanguageValidated = false ;
    boolean isTheaterNameValidated = false ;
    boolean isNoOFTicketsValidated = false;
    boolean isPriceValidated = false ;

    @Override
    public boolean validateAddMovieTickets(MovieTicketsDTO dto) {
        System.out.println("Validation method incoked sevice layer ");

        if( dto != null){

            if(dto.getMovieName() != null){
                isMovieNameValidated = true;
            }
            if (dto.getLanguage() !=null){
                isLanguageValidated = true;
            }

            if (dto.getTheaterName() != null){
                isLanguageValidated = true;
            }

            if (dto.getNoOfTickets() >0){
                isNoOFTicketsValidated = true;

            }
            if (dto.getPrice() > 0){
                isPriceValidated = true;
            }
        }

        if (isMovieNameValidated == true && isLanguageValidated == true && isTheaterNameValidated == true && isNoOFTicketsValidated == true && isPriceValidated){
            System.out.println("validation of all fiels of service layer ");
            bookMyShowRepository.addMovieTicket(dto);
        }


        return true;
    }

    @Override
    public MovieTicketsDTO getMovieInfoById(int id) {

        System.out.println("onvoked get method of service layer");

        MovieTicketsDTO dto = null;
        if (id>0){
            dto = bookMyShowRepository.getBookingInfoByID(id);
        }
        return null;
    }
}
