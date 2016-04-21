package pl.dzmitrow.training.lab04;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dzmitrow.training.lab04.order.Coffee;
import pl.dzmitrow.training.lab04.order.CoffeeType;
import pl.dzmitrow.training.lab04.order.Order;
import pl.dzmitrow.training.lab04.order.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")){
            Coffee c = new Coffee(CoffeeType.AMERICANO,true);
            Coffee c2 = new Coffee(CoffeeType.ESPRESSO,false);

            List<OrderItem> orders = new ArrayList<>();
            orders.add(new OrderItem(c));
            orders.add(new OrderItem(c2));
            Order order = new Order(orders);

            CafeSpring cafeSpring = applicationContext.getBean("cafe",CafeSpring.class);
            cafeSpring.placeOrder(order);

            Thread.sleep(50000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
