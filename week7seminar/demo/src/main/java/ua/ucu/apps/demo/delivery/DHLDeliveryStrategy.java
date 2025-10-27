package ua.ucu.apps.demo.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public double delivery(double orderPrice) {
        System.out.println("DHL delivery");
        return 50;
    }
}