package jv.spingexample;

public class MessagePrinterImpl3 implements MessagePrinter {

    private MessageDecorator decorator;
    private String delimiter; 

    public MessagePrinterImpl3(MessageDecorator decorator, String delimiter) {
        this.decorator = decorator;
        this.delimiter = delimiter;
    }
    
    @Override
    public void printMessage(String message) {
        System.out.println(delimiter);
        System.out.println("message to print = { " + decorator.decorateString(message) + " }");
        System.out.println(delimiter);
    }
}

