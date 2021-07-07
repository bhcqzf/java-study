package cn.bigbaic;

import cn.bigbaic.Util.MybatisUtil;
import cn.bigbaic.dao.StudentDao;
import cn.bigbaic.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

public class TestMybatis3 {
    @Test
    public void testInsert(){
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = dao.selectStudentsById(1004);
        System.out.println(student);
        sqlSession.close();
    }
}