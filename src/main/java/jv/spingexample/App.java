package jv.spingexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        MessagePrinter printer1 = (MessagePrinter) ctx.getBean("bean1");
        MessagePrinter printer2 = (MessagePrinter) ctx.getBean("bean2");
        MessagePrinter printer3 = (MessagePrinter) ctx.getBean(MessagePrinterImpl3.class);
        printer1.printMessage("hello Spring");
        printer2.printMessage("hello Spring");
        printer3.printMessage("hello Spring");
    }
}
