package cn.bigbaic.controller;

import cn.bigbaic.domain.Student;
import cn.bigbaic.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * <h3>spirngmvc-study</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-30 11:20
 **/

@Controller
@RequestMapping(value="/student")
public class MyController {
    @Resource
    private StudentService service;
    //注册学生
    @RequestMapping(value="/addStudent.service")
    public ModelAndView addStudent(Student student){
        String tips = "注册失败";
        //调用service处理service
        int nums = service.addStudent(student);

        if (nums > 0 ){
            tips = "注册成功";
        }
        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }
}
