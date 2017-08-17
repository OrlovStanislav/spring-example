package jv.spingexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        new MessagePrinterImpl().printMessage("hello");
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
//        MessagePrinter printer = (MessagePrinter) ctx.getBean("bean1");
        MessagePrinter printer = (MessagePrinter) ctx.getBean(MessagePrinterImpl3.class);
        printer.printMessage("hello Spring");
//        System.out.println(ctx.getBean(MessageDecorator.class).decorateString("hello vasja"));
    }
}
