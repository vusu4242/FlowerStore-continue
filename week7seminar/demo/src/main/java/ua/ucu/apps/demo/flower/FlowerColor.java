package ua.ucu.apps.demo.flower;
import lombok.Getter;


@Getter
public enum FlowerColor {
    RED ("#FF0000"), 
    YELLOW("#FFFF00"), 
    WHITE("#FFFFFF"),
    BLUE("#0000FF");

    private final String code;


    private FlowerColor(String code) {
        this.code=code;
    }
    @Override public String toString() { return code; }
}
