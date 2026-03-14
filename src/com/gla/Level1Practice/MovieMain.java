package com.gla.Level1Practice;

public class MovieMain {
    public static void main(String[] args) {
        Movie ticket = new Movie("Inception");
        ticket.bookTicket("A12", 1500.0);
        ticket.displayTicket();
    }
}
