package com.gla.Level1;

public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayPhoneDetails() {
        System.out.println("Mobile [Brand: " + brand + ", Model: " + model + ", Price: $" + price + "]");
    }
}

