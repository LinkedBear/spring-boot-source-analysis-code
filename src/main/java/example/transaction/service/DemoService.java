package example.transaction.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {
    
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED)
    public void test1() {
        System.out.println("test1 run...");
//        int i = 1 / 0;
        System.out.println("test1 finish...");
    }
    
}
