package cn.bigbaic.dao;

import cn.bigbaic.domain.Student;

import java.util.List;

//接口操作student表
public interface StudentDao {
    //查询student所有的数据
    public List<Student> selectStudents();

    //插入方法
    //参数: student ,表示要插入到数据库的数据
    //返回值：int ，表示执行insert之后，影响的数据库行数
    public int insertStudent(Student student);
}
