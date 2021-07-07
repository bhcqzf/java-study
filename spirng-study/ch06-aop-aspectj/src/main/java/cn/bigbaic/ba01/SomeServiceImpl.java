package cn.bigbaic.ba01;

/**
 * <h3>dstaidaili</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-06 16:29
 **/

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name , Integer age) {
        //给doSome方法增加了一个功能，给doSome()执行之前，输出方法的执行时间
        System.out.println("========目标方法doSome()============");
    }
    public Integer doOther(Integer int1 , Integer int2){
        return int1 + int2;
    }

    public Student createStudent(String name,Integer age){
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        return student;
    }
    public String doFirst(){
        return "我是doFirst";
    }
}
