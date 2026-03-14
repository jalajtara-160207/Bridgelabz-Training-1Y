package com.gla.Level1;

public class ItemMain {
    public static void main(String[] args) {
        Item item = new Item("P001", "Laptop", 1200.0);
        item.displayItemDetails();
        System.out.println("Total Cost for 3 items: $" + item.calculateTotalCost(3));
    }
}
