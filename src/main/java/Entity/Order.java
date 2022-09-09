package Entity;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Order {
    private Client client;
    private Shop shop;

    public Order(Client client, Shop shop) {
        this.client = client;
        this.shop = shop;
    }

    public String createOrderJSON(){
        return "{\"Client\":"+ createJSON(this.client) +",\"Shop\":" + createJSON(this.shop) + "}";
    }

    private String createJSON(Object obj){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return objectMapper.writeValueAsString(obj);
        }catch(Exception e){
            System.out.println(e);
            return null;
        }

    }
}
