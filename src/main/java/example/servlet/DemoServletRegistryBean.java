package example.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;

public class DemoServletRegistryBean extends ServletRegistrationBean<DemoServlet> {
    
    public DemoServletRegistryBean(DemoServlet servlet, String... urlMappings) {
        super(servlet, urlMappings);
    }
    
}
