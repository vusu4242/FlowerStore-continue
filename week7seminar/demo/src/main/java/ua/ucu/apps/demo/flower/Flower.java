package ua.ucu.apps.demo.flower;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Data  // automatic getter and setter and annotation
@NoArgsConstructor
@AllArgsConstructor
public class Flower {
    private FlowerColor color;
    private double sepalLength;
    private double price;
    private FlowerType flowertype;

    public Flower(Flower other){
        this.color = other.color;
        this.sepalLength = other.sepalLength;   //copy
        this.price = other.price;                  // dont need getter and setter because the same class
        this.flowertype = other.flowertype;
    }

    public String getColor() {
        return color == null ? null : color.getCode();
    }

    public static class Color {

        public Color() {
        }
    }

} 

