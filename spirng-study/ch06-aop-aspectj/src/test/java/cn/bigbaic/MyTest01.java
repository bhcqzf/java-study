package cn.bigbaic;

import cn.bigbaic.ba01.SomeService;
import cn.bigbaic.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <h3>dstaidaili</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-06 17:13
 **/

public class MyTest01 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
        //通过代理对象的执行方法，实现目标方法执行时，增强了功能
        proxy.doSome("李四",20);
        System.out.println("proxy"+ proxy.getClass().getName());
    }

    @Test
    public void test02(){String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
        //通过代理对象的执行方法，实现目标方法执行时，增强了功能
        proxy.doOther(10,20);
        System.out.println("proxy"+ proxy.getClass().getName());

    }

    @Test
    public void test03(){String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
        //通过代理对象的执行方法，实现目标方法执行时，增强了功能
//        Student student = proxy.createStudent("张三",20);
//        System.out.println(student);
        proxy.createStudent("张三",20);
        System.out.println("proxy"+  proxy.getClass().getName());

    }
    @Test
    public void test04(){String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
        //通过代理对象的执行方法，实现目标方法执行时，增强了功能
        proxy.doFirst();
        System.out.println("proxy"+  proxy.getClass().getName());

    }
}
