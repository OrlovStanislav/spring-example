package jv.spingexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        MessagePrinter printer1 = (MessagePrinter) ctx.getBean("messagePrinter");
        MessagePrinter printer2 = (MessagePrinter) ctx.getBean(MessagePrinterImpl2.class);
        printer1.printMessage("hello Spring");
        printer2.printMessage("hello Spring");
    }
}
