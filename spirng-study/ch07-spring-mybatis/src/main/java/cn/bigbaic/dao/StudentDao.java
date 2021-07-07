package cn.bigbaic.dao;

import cn.bigbaic.domain.Student;

import java.util.List;

/**
 * <h3>dstaidaili</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-07 15:17
 **/

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
