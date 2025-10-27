package ua.ucu.apps.demo.flower;

import lombok.Data;

@Data
public class FlowerPack {
    private Flower flower;
    private int quantity;


    public FlowerPack(Flower flower, int quantity){
        this.flower = new Flower(flower);                   // dont take by origin address just make copy. 
        this.quantity = quantity;
    }


    public void setFlower(Flower flower){
        this.flower = new Flower(flower) ;
      
    }


    public double getPrice(){
        return flower.getPrice()*quantity;
    }
}
