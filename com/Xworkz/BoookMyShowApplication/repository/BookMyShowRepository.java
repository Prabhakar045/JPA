package com.Xworkz.BoookMyShowApplication.repository;

import com.Xworkz.BoookMyShowApplication.dto.MovieTicketsDTO;

public interface BookMyShowRepository {

    public  boolean addMovieTicket(MovieTicketsDTO dto);

    public MovieTicketsDTO getBookingInfoByID(int id);
}
