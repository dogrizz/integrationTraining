package pl.dzmitrow.training.lab03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")){
            while(true){
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
