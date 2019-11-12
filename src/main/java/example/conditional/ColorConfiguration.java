package example.conditional;

import example.enablexxx.Black;
import example.enablexxx.Blue;
import example.enablexxx.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfiguration {
    
    @Bean
    public Red red() {
        return new Red();
    }
    
    @Bean
    public Black black() {
        return new Black();
    }
    
    @Bean
    @Conditional(ColorConditional.class)
    public Blue blue() {
        return new Blue();
    }
    
}
