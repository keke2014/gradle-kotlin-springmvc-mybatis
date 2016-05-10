package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by juke.zjk on 2016/5/6 006.
 */
public class Runner {

    private static final String APP_CTX_CONFIG_FILE = "applicationContext.xml";

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(APP_CTX_CONFIG_FILE);
        IService service = applicationContext.getBean("service", IService.class);
        service.welcome();
    }
}
