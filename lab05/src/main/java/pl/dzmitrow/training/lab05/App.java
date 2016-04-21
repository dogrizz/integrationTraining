package pl.dzmitrow.training.lab05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")){

                Thread.sleep(50000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
