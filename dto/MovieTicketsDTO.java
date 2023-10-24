package com.Xworkz.TicketBookingApplication.dto;

import com.Xworkz.TicketBookingApplication.constant.Language;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@Table(name="movie_tickets1")
@Builder
public class MovieTicketsDTO {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name="movie_name")
    private  String movieName;

    @Column(name="movie_language")
    private Language language;

    @Column(name="location")
    private  String location;

    @Column(name="price")
    private  double price;

    @Column(name="no_of_tickets")
    private  int noOfTickets;

    @Column(name="theater_name")
    private  String theaterName;

    @Column(name="timings")
    private String timings;
}
