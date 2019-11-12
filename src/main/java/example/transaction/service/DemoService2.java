package example.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService2 {
    
    @Autowired
    private DemoService demoService;
    
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void test2() {
        System.out.println("test2 run...");
        demoService.test1();
        System.out.println("test2 finish...");
    }
    
}
