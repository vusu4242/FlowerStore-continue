package ua.ucu.apps.demo.delivery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeliveryTest {
    
    @Test
    public void testPostalDeliveryWithHighPrice() {
        Delivery delivery = new PostalDeliveryStrategy();
        double result = delivery.delivery(1500);
        assertEquals(0, result, "Postal delivery should be free for orders over 1000");
    }
    
    @Test
    public void testPostalDeliveryWithLowPrice() {
        Delivery delivery = new PostalDeliveryStrategy();
        double result = delivery.delivery(500);
        assertEquals(100, result, "Postal delivery should cost 100 for orders under 1000");
    }
    
    @Test
    public void testPostalDeliveryAtThreshold() {
        Delivery delivery = new PostalDeliveryStrategy();
        double result = delivery.delivery(1000);
        assertEquals(100, result, "Postal delivery should cost 100 for orders at 1000");
    }
    
    @Test
    public void testDHLDelivery() {
        Delivery delivery = new DHLDeliveryStrategy();
        double result = delivery.delivery(500);
        assertEquals(50, result, "DHL delivery should always cost 50");
    }
    
    @Test
    public void testDHLDeliveryWithHighPrice() {
        Delivery delivery = new DHLDeliveryStrategy();
        double result = delivery.delivery(2000);
        assertEquals(50, result, "DHL delivery should always cost 50 regardless of order price");
    }
}