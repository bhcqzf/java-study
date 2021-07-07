package cn.bigbaic;

import cn.bigbaic.service.SomeService;
import cn.bigbaic.service.impl.SomeServiceImpl;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }
    @Test
    public void test02(){
        //使用spring容器创建的对象
        //1、指定spring配置文件的名称
        String config = "beans.xml";
        //2、创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示spring容器，通过容器创建对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，叫做getBean
        //getBean("配置文件中的id值")
        SomeService someService = (SomeService) ac.getBean("someService");

        //使用service创建的对象
        someService.doSome();



    }


    @Test
    public void test03(){

        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println(nums);

        //获取容器中对象的名称;
        String[] names = ac.getBeanDefinitionNames();
        System.out.println(names);
        for (String name:
             names) {
            System.out.println(name);
        }

    }
    @Test
    public void test04(){
        //默认调用的是无参构造
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date my = (Date) ac.getBean("mydate");
        System.out.println(my);
    }
}
