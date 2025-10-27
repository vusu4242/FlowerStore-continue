package ua.ucu.apps.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        System.out.println("Paid with PayPal");
        return price;
    }
}