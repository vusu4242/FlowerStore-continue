package ua.ucu.apps.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.ucu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.ucu.apps.demo.payment.PayPalPaymentStrategy;
import ua.ucu.apps.demo.payment.Payment;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    
    @GetMapping("/creditcard")
    public String payCreditCard(@RequestParam double price) {
        Payment payment = new CreditCardPaymentStrategy();
        double amount = payment.pay(price);
        return "Paid $" + amount + " with Credit Card";
    }
    
    @GetMapping("/paypal")
    public String payPayPal(@RequestParam double price) {
        Payment payment = new PayPalPaymentStrategy();
        double amount = payment.pay(price);
        return "Paid $" + amount + " with PayPal";
    }
}