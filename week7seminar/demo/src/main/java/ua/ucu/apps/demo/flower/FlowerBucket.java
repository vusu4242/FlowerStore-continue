package ua.ucu.apps.demo.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket(){
        this.flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }


    public double getPrice(){
        return flowerPacks.stream()
            .mapToDouble(pack-> pack.getPrice())
            .sum();
    }
}
