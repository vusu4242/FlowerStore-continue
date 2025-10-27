package ua.ucu.apps.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.ucu.apps.demo.delivery.Delivery;
import ua.ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ua.ucu.apps.demo.delivery.PostalDeliveryStrategy;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    
    @GetMapping("/postal")
    public String getPostalDelivery(@RequestParam double orderPrice) {
        Delivery delivery = new PostalDeliveryStrategy();
        double cost = delivery.delivery(orderPrice);
        return "Postal delivery cost for order $" + orderPrice + " is: $" + cost;
    }
    
    @GetMapping("/dhl")
    public String getDHLDelivery(@RequestParam double orderPrice) {
        Delivery delivery = new DHLDeliveryStrategy();
        double cost = delivery.delivery(orderPrice);
        return "DHL delivery cost for order $" + orderPrice + " is: $" + cost;
    }
}