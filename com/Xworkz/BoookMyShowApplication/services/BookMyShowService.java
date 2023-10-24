package com.Xworkz.BoookMyShowApplication.services;

import com.Xworkz.BoookMyShowApplication.dto.MovieTicketsDTO;

public interface BookMyShowService {
    public  boolean validateAddMovieTickets(MovieTicketsDTO dto);

    public MovieTicketsDTO getMovieInfoById(int id);


}
