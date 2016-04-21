package pl.dzmitrow.training.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dzmitrow.training.orders.order.Coffee;
import pl.dzmitrow.training.orders.order.CoffeeType;
import pl.dzmitrow.training.orders.order.Order;
import pl.dzmitrow.training.orders.order.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@EnableAutoConfiguration
public class App {

    Random random = new Random();

    @RequestMapping("api/orders")
    public Order getOrder(){

        List<OrderItem> orders = new ArrayList<>();
        for(int i=0;i<random.nextInt(5)+1;i++){
            orders.add(new OrderItem(new Coffee(CoffeeType.AMERICANO,true)));
        }

        return new Order(orders);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

}
