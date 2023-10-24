package com.Xworkz.TicketBookingApplication.TicketBooking;

import com.Xworkz.TicketBookingApplication.constant.Language;
import com.Xworkz.TicketBookingApplication.dto.MovieTicketsDTO;

import java.util.Scanner;

public class BookingExecutor {



    public static void main(String[] args) {

        BookMyShow boook = new BookMyShowImpl();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {

            int id=1;
            MovieTicketsDTO mv = MovieTicketsDTO.
                    builder().
                    movieName(sc.next()).
                    language(Language.valueOf(sc.next())).
                    location(sc.next()).
                    price(sc.nextDouble()).
                    noOfTickets(sc.nextInt()).
                    theaterName(sc.next()).
                    timings(sc.next()).
                    id(id++).
                    build();

              boook.addMovieaTicketInfo(mv);
        }

        System.out.print("Enter the ID of the movie ticket to retrieve: ");
        int ticketId = sc.nextInt();
        MovieTicketsDTO retrievedTicket = boook.getBookingInfoId(ticketId);

        if (retrievedTicket != null) {
            System.out.println("Details of the  movie ticket: ");
            System.out.println(retrievedTicket);
        } else {
            System.out.println("not found movie this for this id ");
        }
    }

}
