package com.Xworkz.BoookMyShowApplication;

import com.Xworkz.BoookMyShowApplication.dto.MovieTicketsDTO;
import com.Xworkz.BoookMyShowApplication.services.BookMyShowService;
import com.Xworkz.BoookMyShowApplication.services.Impl.BookMyShowServiceImpl;

import java.util.Scanner;

public class MovieTicketsExecutor {

    public static void main(String[] args) {
        BookMyShowService bookMyShowService = new BookMyShowServiceImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of movies to be added : ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {


            System.out.println("Product details for Product " + (i + 1) + ":");

            sc.nextLine();

            System.out.println("Enter the Movie name: ");
            String movieName = sc.nextLine();

            System.out.println("Enter the Language: ");
            String language = sc.nextLine();

            System.out.println("Enter the Theater Name: ");
            String theaterName = sc.nextLine();

            System.out.println("Enter the noOfTickets: ");
            int noOfTickets = sc.nextInt();

            System.out.println("Enter the price: ");
            double price = sc.nextDouble();

            MovieTicketsDTO movieTicketsDTO = new MovieTicketsDTO();
            movieTicketsDTO.setMovieName(movieName);
            movieTicketsDTO.setLanguage(language);
            movieTicketsDTO.setTheaterName(theaterName);
            movieTicketsDTO.setNoOfTickets(noOfTickets);
            movieTicketsDTO.setPrice(price);

            boolean result = bookMyShowService.validateAddMovieTickets(movieTicketsDTO);
            if (result) {
                System.out.println("Movie tickets added successfully.");
            } else {
                System.out.println("Failed to add movie tickets.");
            }

        }
    }
}
