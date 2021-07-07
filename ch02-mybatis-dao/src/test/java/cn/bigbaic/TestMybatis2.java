package cn.bigbaic;

import cn.bigbaic.Util.MybatisUtil;
import cn.bigbaic.dao.StudentDao;
import cn.bigbaic.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class TestMybatis2 {
    @Test
    public void testInsert(){
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("baibai");
        student.setId(1006);
        student.setEmail("bai@qq.com");
        student.setAge(22);
        int insertcount = dao.insertStudents(student);
        sqlSession.commit();
        sqlSession.close();
    }
}
