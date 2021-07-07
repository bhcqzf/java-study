package cn.bigbaic;

import cn.bigbaic.dao.StudentDao;
import cn.bigbaic.domain.Student;
import cn.bigbaic.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * <h3>dstaidaili</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-07 15:32
 **/

public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        String names[] = ctx.getBeanDefinitionNames();
        for (String na:
             names) {
            System.out.println("容器中对象名称:"+na+"|"+ctx.getBean(na));
        }
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ctx.getBean("studentService");
        Student student = new Student();
        student.setId(1014);
        student.setName("李胜利");
        student.setAge(27);
        student.setEmail("lishengli@qq.com");
        int num = service.addStuent(student);
        //spring和mybatis整合在一起使用，事物是自动提交的，无需执行sqlSession.commit()
        System.out.println("num:" + num );
    }

    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ctx.getBean("studentService");
        List<Student> studentList = service.queryStudents();
        for (Student student:
             studentList) {
            System.out.println(student);
        }
    }
}
