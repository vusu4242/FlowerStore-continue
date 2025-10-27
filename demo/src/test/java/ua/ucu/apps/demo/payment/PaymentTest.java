package ua.ucu.apps.demo.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    
    @Test
    public void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy();
        double price = 100.0;
        double result = payment.pay(price);
        assertEquals(price, result, "Credit card payment should return the same price");
    }
    
    @Test
    public void testCreditCardPaymentWithLargeAmount() {
        Payment payment = new CreditCardPaymentStrategy();
        double price = 5000.0;
        double result = payment.pay(price);
        assertEquals(price, result, "Credit card payment should handle large amounts");
    }
    
    @Test
    public void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy();
        double price = 200.0;
        double result = payment.pay(price);
        assertEquals(price, result, "PayPal payment should return the same price");
    }
    
    @Test
    public void testPayPalPaymentWithSmallAmount() {
        Payment payment = new PayPalPaymentStrategy();
        double price = 10.0;
        double result = payment.pay(price);
        assertEquals(price, result, "PayPal payment should handle small amounts");
    }
    
    @Test
    public void testDifferentPaymentStrategies() {
        Payment creditCard = new CreditCardPaymentStrategy();
        Payment payPal = new PayPalPaymentStrategy();
        double price = 150.0;
        
        assertEquals(creditCard.pay(price), payPal.pay(price), 
            "Both payment strategies should return the same amount for the same price");
    }
}