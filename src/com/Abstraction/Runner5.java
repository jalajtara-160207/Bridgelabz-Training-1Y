package com.Abstraction;

public class Runner5 {
    static void main() {
        PaymentGateway.PaymentProcessor paypal = new PaymentGateway.PayPalProcessor();
        PaymentGateway.PaymentProcessor stripe = new PaymentGateway.StripeProcessor();

        paypal.ProcessPayement(800);
        paypal.Refund(50);

        stripe.ProcessPayement(200);
        stripe.Refund(75);
    }

}
