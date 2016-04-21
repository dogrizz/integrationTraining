package pl.dzmitrow.training.lab05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")){
          RatePoller ratePoller = applicationContext.getBean("ratePoller",RatePoller.class);
            ratePoller.refresh("asd");
            Thread.sleep(300000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
