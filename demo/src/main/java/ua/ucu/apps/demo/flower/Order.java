package ua.ucu.apps.demo.flower;
import java.util.ArrayList;
import java.util.List;

import ua.ucu.apps.demo.delivery.Delivery;
import ua.ucu.apps.demo.payment.Payment;

public class Order {
    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public Order(){
        this.items = new ArrayList<>();
    }
    public double getOrderPrice(){
        double finalPrice = items.stream()
        .mapToDouble(Item::getPrice)
        .sum();

        finalPrice+= delivery.delivery(finalPrice);
        return finalPrice;
    }
}
