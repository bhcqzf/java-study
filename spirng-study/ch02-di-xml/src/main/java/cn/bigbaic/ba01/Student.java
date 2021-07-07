package cn.bigbaic.ba01;

public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        System.out.println("正在调用setName方法");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("正在调用setAge方法");
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
