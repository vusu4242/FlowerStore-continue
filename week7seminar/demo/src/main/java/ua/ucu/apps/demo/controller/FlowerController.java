package ua.ucu.apps.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.ucu.apps.demo.flower.Flower;
import ua.ucu.apps.demo.flower.FlowerColor;
import ua.ucu.apps.demo.flower.FlowerType;

@RestController
@RequestMapping("/api")
public class FlowerController {

    @GetMapping("/flowers")
    public List<Flower> getFlowers(){
        return List.of(
            new Flower(FlowerColor.BLUE, 100, 10, FlowerType.CHAMOMILE)
        );
    }
}
