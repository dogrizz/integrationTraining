package pl.dzmitrow.training.lab04;

import pl.dzmitrow.training.lab04.order.Coffee;

import java.util.List;

public class Waiter {

    public void serve(List<Coffee> cofeeList) {
        System.out.println("Serving... " + cofeeList);
    }

}
