package cn.bigbaic.ba02;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Component： 创建对象的，等同于<bean> 的功能
 * 属性： value 就是对象的名称，也就是bean的id值，
 * value的值是唯一的，创建的对象在整个spring同期中就一个
 * 位置：在类的上面
 *
 * @Component(value = "myStudent")等同于
 * <bean id = "myStudent" class = "cn.bigbaic.ba01.Student" />
 *
 *
 * spring中和@Component功能一样，创建对象的注解还有：
 * 1、@Repository(应用在持久层上面): 放在dao的实现类上面，表示创建dao对象，dao对象是能访问数据库的
 * 2、@Service（用在业务层面上） ：放在service上面，创建service对象，service对象是做业务处理 可以有食物功能的
 * 3、@Controller（用在控制器上面）：  放在控制器（处理器）类的上面，创建控制器对象的
 *      控制器对象，能够接受用户提交的参数，显示请求的处理结果
 * 以上三个注解的使用语法和Componenty一样，都能创建对象，但是着三个注解还有额外的功能
 * @Repository,@Service,@Controller 是给项目的对象分层的，
 *
 */


//@Component(value = "myStudent")
//@Component("myStudent")
@Component
public class Student {
    /**
     * @Value 简单类型属性赋值
     * 属性：value 是String类型的，表示简单类型的属性值
     * 位置：1、在属性定义上面，无需set方法，推荐使用
     *      2、在set方法的上面
     *
     */
    @Value("张飞")
    private String name;
    @Value("29")
    private int age;

    public Student() {
        System.out.println("===无参构造===");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
