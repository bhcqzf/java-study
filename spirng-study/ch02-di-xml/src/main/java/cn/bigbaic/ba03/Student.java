package cn.bigbaic.ba03;

public class Student {
    private String name;
    private int age;
    private School school;

    public void setSchool(School school) {
        this.school = school;
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

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
                ", school=" + school +
                '}';
    }
}
