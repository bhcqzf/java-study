package cn.bigbaic.dao;

import cn.bigbaic.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
