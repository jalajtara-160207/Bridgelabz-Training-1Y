package com.Abstraction;

public class PaymentGateway {
    interface PaymentProcessor {
        void ProcessPayement(double Amount);

        default void Refund(double Amount) {
            System.out.println("Refund feature Not Supproted by This Provider.");
        }

        void ProcessPayment(double v);
    }

    static class PayPalProcessor implements PaymentProcessor {


        @Override
        public void ProcessPayement(double Amount)
        {
            System.out.println("Processing PayPal Payment of $" + Amount);
        }

        @Override
        public void Refund(double Amount)
        {
            System.out.println("Refunding $" + Amount + "via Paypal.");
        }

        @Override
        public void ProcessPayment(double v)
        {
            System.out.println("v is:-"+v);
        }

    }

    static class StripeProcessor implements PaymentProcessor
    {

        @Override
        public void ProcessPayement(double Amount)
        {
            System.out.println("Processing Stripe Payment of $"+Amount);
        }

        @Override
        public void ProcessPayment(double v)
        {
            System.out.println("v is:-"+v);
        }

    }
}

