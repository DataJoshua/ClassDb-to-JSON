package Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Client {
    private String name;
    private String adress;
    private String phone;
    private String email;
    private String paymentMethod;
    private Product productToBuy;
    private int payAmount;

    public Client(Product productToBuy){
        this.productToBuy = productToBuy;
        payAmount = productToBuy.getPrice();
    }

}
