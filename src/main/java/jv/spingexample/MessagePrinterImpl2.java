package jv.spingexample;

public class MessagePrinterImpl2  implements MessagePrinter {

    @Override
    public void printMessage(String message) {
        System.out.println("message to print = [ " + message.toUpperCase() + " ]");
    }
    
}
