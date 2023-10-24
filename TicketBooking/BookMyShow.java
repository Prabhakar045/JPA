package com.Xworkz.TicketBookingApplication.TicketBooking;

import com.Xworkz.TicketBookingApplication.dto.MovieTicketsDTO;

public interface BookMyShow {

    boolean addMovieaTicketInfo(MovieTicketsDTO dto);

    public  MovieTicketsDTO getBookingInfoId(int id);
}
