package Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Shop {
    private String name;
    private String adress;
    private ArrayList<Product> productList;

}
