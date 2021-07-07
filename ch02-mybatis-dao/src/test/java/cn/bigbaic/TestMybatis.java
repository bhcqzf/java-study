package cn.bigbaic;

import cn.bigbaic.Util.MybatisUtil;
import cn.bigbaic.dao.StudentDao;
import cn.bigbaic.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test
    public void testMybatis(){
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudents();
        for (Student stu:
             students) {
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
