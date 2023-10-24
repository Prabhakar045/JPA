package com.Xworkz.IRCTCApplication.IRCTCAPP;

import com.Xworkz.IRCTCApplication.dto.TravellerDto;

import java.util.Scanner;

public class IrctcTester {

    public static void main(String[] args) {
        Irctc irctc = new IrctcImpl();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            sc.nextLine();

            System.out.println("Booking details for Ticket " + (i + 1) + ":");

            System.out.print("Traveller Name: ");
            String travellerName = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Ticket Price: ");
            double price = sc.nextDouble();

            sc.nextLine();

            System.out.print("From: ");
            String from = sc.nextLine();

            System.out.print("Destination: ");
            String destination = sc.nextLine();

            // Create a TravellerDto object
            TravellerDto dto = new TravellerDto();

            // Book the ticket
            boolean bookingResult = irctc.bookTicket(dto);
            if (bookingResult) {
                System.out.println("Ticket booked successfully.");
            } else {
                System.out.println("Ticket booking failed.");
            }
        }
    }
}
