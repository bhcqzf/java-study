package cn.bigbaic.ba01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;

/**
 * <h3>dstaidaili</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-06 16:45
 *
 * @Aspect:是aspectj 框架中的注解
 * 作用：表示当前类是切面类
 * 切面类： 是用来给业务方法增加功能的类，在这个类中有切面的功能代码
 * 位置：在类定义的上面
 *
 **/
@Aspect
public class MyAsoect {
    /**
     * 定义方法：定义是事项切面功能的
     * 方法的定义要求：
     * 1、公共方法 public
     * 2、方法没有返回值
     * 3、方法名称自定义
     * 4、方法可以有参数，也可以没有参数
     *      如果有参数，参数不是自定义的，有几个参数类型可以使用
     *
     */

    /**
     * @Before 前置通知注解
     * 属性：value 是切入点表达式，表示切面的功能执行的位置
     * 位置：方法的上面
     * 特点：
     * 1、在目标方法之前执行的
     * 2、不会改变目标方法的执行结果
     * 3、不会影响目标执行的结果
     *
     */

    @Before(value = "execution(* SomeServiceImpl.doSome(..))")
    public void myBefore(){
        //就是你切面执行的功能代码
        System.out.println("前置通知 切面功能：在目标方法之前输出执行时间："+ new Date());
    }

    @AfterReturning(value = "execution(* SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfter(Object res){
        System.out.println("后置通知显示的数据为:"+res);
    }
    @AfterReturning(value = "execution(* SomeServiceImpl.createStudent(..))",returning = "res")
    public void myAfter2(Object res){

        System.out.println("后置通知显示的数据为:"+res);
        res = "123";
    }

    @Around(value = "mypt()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result = null;
        System.out.println("执行方法之前");
        result = pjp.proceed(); //相当于method.invoke() Object result = doFirst()
        System.out.println(result);
        System.out.println("执行方法之后");
        return result;
    }

    @Pointcut(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public void mypt(){
        //无需代码
    }
}
