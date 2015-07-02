package chainOfResponsibility;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import sun.org.mozilla.javascript.internal.ContextFactory;

/**
 * Created by wzyoung on 2015/7/2.
 */
public class TestClient {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\workspaces\\HeadFirstPatten\\web\\WEB-INF\\SpringContext.xml");

        BaseService baseService = applicationContext.getBean("serviceA", BaseService.class);

        baseService.handle();
    }
}

