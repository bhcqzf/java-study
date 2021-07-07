package cn.bigbaic;

import cn.bigbaic.Util.MybatisUtil;
import cn.bigbaic.dao.StudentDao;
import cn.bigbaic.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMybatis4 {
    @Test
    public void testMybatis4(){
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectStudentsByNameOrAge("张三",20);
        for (Student stu:
           studentList) {
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
