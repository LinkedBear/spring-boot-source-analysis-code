package example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@ComponentScan("example.config")
public class ConfigurationDemo {
    
    @Bean
    public Date currentDate() {
        return new Date();
    }
    
}
