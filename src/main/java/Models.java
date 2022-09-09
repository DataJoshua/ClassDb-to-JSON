
import Entity.Order;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Models {

   public static String createJSON(Object obj){
       ObjectMapper objectMapper = new ObjectMapper();
       try{
           return objectMapper.writeValueAsString(obj);
       }catch(Exception e){
           System.out.println(e);
           return null;
       }

   }
    public static String createOrdersArray(Order...orders){
        String result = "[";

        for(int i = 0; i < orders.length; i++){
            result += orders[i].createOrderJSON();
            result += ",";
        }
        /// There is a bug with the final

        result +="]";
        return result.replaceAll(",]", "]");
    }
}
