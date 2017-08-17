package jv.spingexample;

import org.springframework.stereotype.Component;

@Component
public class MessageDecoratorImpl implements MessageDecorator {

    @Override
    public String decorateString(String s) {
        StringBuffer b = new StringBuffer();
        s = s.toUpperCase();
        char[] chars = s.toCharArray();
        for(char c : chars){
            b.append(c).append(" ");
        }
        return b.toString();
    }
    
}
