package pl.dzmitrow.training.lab04;

import pl.dzmitrow.training.lab04.order.Coffee;
import pl.dzmitrow.training.lab04.order.OrderItem;

import java.util.Random;

public class Barista {

    private Random random = new Random();
    public Coffee prepareCoffee(OrderItem orderItem){
        try {
            Thread.sleep(random.nextInt(5000));
            System.out.println("Cofee "+orderItem.getCoffee()+" is ready ...");
            return orderItem.getCoffee();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
