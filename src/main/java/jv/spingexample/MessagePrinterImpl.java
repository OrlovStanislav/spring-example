package jv.spingexample;

import org.springframework.beans.factory.annotation.Autowired;

public class MessagePrinterImpl implements MessagePrinter {

    @Autowired
    private MessageDecorator decorator;
    
    @Override
    public void printMessage(String message) {
        System.out.println("message to print = { " + decorator.decorateString(message) + " }");
    }

    public void setDecorator(MessageDecorator decorator) {
        this.decorator = decorator;
    }
}
