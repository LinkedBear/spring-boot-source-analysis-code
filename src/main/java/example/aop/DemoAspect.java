package example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DemoAspect {
    
    @Before("execution(public * com.example.demo.*.*(..))")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("doBefore run...");
    }
    
}
