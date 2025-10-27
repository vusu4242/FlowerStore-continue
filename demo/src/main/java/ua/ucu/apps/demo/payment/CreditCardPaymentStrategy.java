package ua.ucu.apps.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        System.out.println("Paid with credit card");
        return price;
    }
}