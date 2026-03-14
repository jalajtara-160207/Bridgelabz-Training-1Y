package com.gla.Level1;

public class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Code: " + itemCode + ", Name: " + itemName + ", Price: $" + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

