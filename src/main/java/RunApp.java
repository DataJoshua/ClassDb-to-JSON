import Entity.Client;
import Entity.Order;
import Entity.Product;
import Entity.Shop;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

public class RunApp {
    public static void main(String[] args) {

        //creating shop

        Shop myShop = new Shop();
        myShop.setName("cucci");
        myShop.setAdress("Ru, Kazan, Koltzo");
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("shirt", 1000, "m", "standart"));
        products.add(new Product("shirt", 200, "s", "mini"));

        myShop.setProductList(products);

        //creating Client

        Client client1 = new Client(myShop.getProductList().get(0));
        client1.setName("joshua");
        client1.setEmail("joshua@gmail.com");
        client1.setPhone("198379218374");
        client1.setPaymentMethod("card");
        client1.setAdress("Ru, derevnia universiady");

        Order order1 = new Order(client1, myShop);
        Order order2 = new Order(client1, myShop);


        String result = Models.createOrdersArray(order1, order2);




        try{ // make properly file writer

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("obj.json"));
            bufferedWriter.write(result);
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("obj.json"));
            System.out.println(bufferedReader.readLine());

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
