package com.gla.Level1Practice;

public class Movie {
    private String movieName;
    private String seatNumber;
    private double price;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + (seatNumber != null ? seatNumber : "Not assigned"));
        System.out.println("Price: $" + price);
    }
}

