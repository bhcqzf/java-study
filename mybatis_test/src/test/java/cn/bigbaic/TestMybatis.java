package cn.bigbaic;

import cn.bigbaic.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
public class TestMybatis {
    //测试方法，测试功能
    @Test
    public void testInsert() throws IOException {
        //访问mybatis读取student数据
        //1.定义mybatis主配置文件的名称,从类路径根开始(target/classes)
        String config = "mybatis.xml";
        //2.读取这个config表示的文件
        InputStream in = Resources.getResourceAsStream(config);
        //3.创建了sqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //4、创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);
        //5、【重要】获取sqlSessionFactory对象，从SqlSessionFactory获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //6、【重要】指定要执行的sql语句的标识。sql映射文件中的namespace+"."+标签的id值
        String sqlId = "cn.bigbaic.dao.StudentDao" +"."+ "insertStudents";
        //7、执行sql语句，通过sqlid找到语句
        Student student = new Student();
        student.setAge(20);
        student.setEmail("zhaoyun@163.com");
        student.setId(1005);
        student.setName("赵云");
        int intNum =  sqlSession.insert(sqlId,student);

        //mybatis默认是不提交事务的，所以在insert update之后需要提交事务
        sqlSession.commit();
        //8、输出结果
//        System.out.println(intNum==1?"插入成功":"插入失败");
        //9、关闭sqlSession对象
        sqlSession.close();
    }
}
