package com.Xworkz.IRCTCApplication.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "irctc_booking")
public class TravellerDto {

    @Id
    @Column(name = "ticket_id")
    private int ticketId;
    @Column(name = "traveller_name")
    private String travellerName;
    @Column(name="email")
    private String email;
    @Column(name="ticket_price")
    private  double price;
    @Column(name = "from1")
    private String from1;
    @Column(name = "destination")
    private  String destination ;


}
