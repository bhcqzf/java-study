package cn.bigbaic.service;

import cn.bigbaic.domain.Student;

import java.util.List;

public interface StudentService {
    int addStuent(Student student);
    List<Student> queryStudents();
}
