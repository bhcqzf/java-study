package cn.bigbaic.controller;

import cn.bigbaic.domain.Student;
import cn.bigbaic.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strId = request.getParameter("id");
        String strName = request.getParameter("name");
        String strEmail = request.getParameter("email");
        String strAge = request.getParameter("age");

//        创建spring的容器对象
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ctx.getBean("studentService");
        System.out.println("容器对象的信息=====>"+ctx);
        Student student = new Student();
        student.setId(Integer.valueOf(strId));
        student.setName(strName);
        student.setAge(Integer.valueOf(strAge));
        student.setEmail(strEmail);
        int num = service.addStuent(student);
        //spring和mybatis整合在一起使用，事物是自动提交的，无需执行sqlSession.commit()
        System.out.println("num:" + num );

        //给一个页面
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}
