package example.init;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Cat implements InitializingBean {
    
    public Cat(String name) {
        System.out.println("Cat constructor run...");
    }
    
    @PostConstruct
    public void afterInit() {
        System.out.println("Cat PostConstruct run...");
    }
    
    
    @Override
    public void afterPropertiesSet() {
        System.out.println("Cat afterPropertiesSet run...");
    }
}
