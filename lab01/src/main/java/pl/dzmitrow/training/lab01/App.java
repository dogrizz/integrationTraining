package pl.dzmitrow.training.lab01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public class App {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")){
            MessageChannel channel = applicationContext.getBean("messages",MessageChannel.class);
            Message<String> message = MessageBuilder.withPayload("dd-MM-yyyy hh:mm:ss").build();
            channel.send(message);

            DateTime dateTime = applicationContext.getBean("dateTimeGateway", DateTime.class);
            dateTime.print("dd-MM-yyyy");
            System.out.println(dateTime.get("dd-MM-yyyy"));
        }
    }
}
