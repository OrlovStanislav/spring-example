package jv.spingexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "jv")
public class AnnotationConfig {
    
    @Bean
    public MessagePrinterImpl3 messagePrinter(@Autowired MessageDecorator dec){
        return new MessagePrinterImpl3(dec, "#-#-#-#-#-#-#");
    }
    
}
