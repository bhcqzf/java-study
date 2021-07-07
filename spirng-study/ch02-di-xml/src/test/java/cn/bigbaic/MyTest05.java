package cn.bigbaic;

import cn.bigbaic.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {
    @Test
    public void test01(){
        String config = "ba05/spring-total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }
}
