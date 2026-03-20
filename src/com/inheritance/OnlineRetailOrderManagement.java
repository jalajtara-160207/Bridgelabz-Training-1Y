package com.inheritance;

public class OnlineRetailOrderManagement {
    int OrderID;
    String OrderDate;

    public OnlineRetailOrderManagement(int OrderID, String OrderDate) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
    }
    public void DisplayDetails()
    {
        System.out.println("Enter The Order ID :- "+OrderID);
        System.out.println("Enter The Date of Order :- "+OrderDate);
    }
}
class ShippedOrder extends OnlineRetailOrderManagement
{
    int Tracking_Number;

    public ShippedOrder(int OrderID, String OrderDate, int Tracking_Number)
    {
        super(OrderID, OrderDate);
        this.Tracking_Number = Tracking_Number;
    }
    @Override
    public void DisplayDetails()
    {
        super.DisplayDetails();
        System.out.println("Enter The tracking ID Of The Order:-"+Tracking_Number);
    }
}
class delivered_Order extends ShippedOrder
{
    int deliveryDate;

    public delivered_Order(int OrderID, String OrderDate, int Tracking_Number, int deliveryDate)
    {
        super(OrderID, OrderDate, Tracking_Number);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void DisplayDetails() {

    }

    {
        super.DisplayDetails();
        System.out.println("Enter The Delivery Date of The Order:- "+deliveryDate);
    }
}
