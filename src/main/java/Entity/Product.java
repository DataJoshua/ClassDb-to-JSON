package Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String name;
    private int price;
    private String size;
    private String model;

    public Product(String name, int price, String size, String model) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.model = model;
    }
}
