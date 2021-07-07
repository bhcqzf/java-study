package cn.bigbaic.service.impl;

import cn.bigbaic.dao.StudentDao;
import cn.bigbaic.domain.Student;
import cn.bigbaic.service.StudentService;

import java.util.List;

/**
 * <h3>dstaidaili</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-07 15:46
 **/

public class StudentServiceImpl implements StudentService {
    //引用类型
    private StudentDao studentDao;

    //使用set注入，赋值
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStuent(Student student) {
        int num = studentDao.insertStudent(student);
        return num;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = studentDao.selectStudent();
        return students;
    }
}
