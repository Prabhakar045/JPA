package com.Xworkz.BoookMyShowApplication.dto;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name="movie_tickets2")
public class MovieTicketsDTO {

    @Id
    @Column(name = "movie_id")
    @GenericGenerator(name="pbk", strategy="increment")
    @GeneratedValue(generator = "pbk")
    private int movieId;

    @Column(name = "movie_name")
    private String  movieName;

    @Column(name = "language")
    private String language;

    @Column(name="theater_name")
    private String theaterName;

    @Column(name ="no_of_tickets")
    private int noOfTickets;

    @Column(name="movie_price")
    private double price;

}
