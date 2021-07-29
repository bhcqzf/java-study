package cn.bigbaic.controller;

import cn.bigbaic.vo.Student;
import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * <h3>spirngmvc-study</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-26 16:46
 **/


@Controller
public class MyController {

    /**
     * 逐个接收请求参数：
     *  要求：处理器（控制器）方法的形参名和请求中参数名必须一致
     *          同名的请求参数赋值给同名的参数
     *  框架接收请求参数
     *      1、使用request对象接收请求参数
     *          String strName = request.getParameter("name")
     *          String strAge = request.getParameter("age")
     *      2、springmvc框架通过DispatcherSerlet调用MyController的doSome（）方法
     *          调用方法时，按名称队对应，把接收的参数赋值给形参
     *          doSome(strName,Integer.valueOf(strAge))
     *          框架会提供类型转化功能，能把String转化伟int long float double
     *
     *
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/some.do")
    public String dosome(String name,Integer age){
        //处理some.do请求了
        Map map = new HashMap<>();
        map.put("name",name);
        map.put("age",age);
        String res = JSON.toJSONString(map);
        return res;
    }
    @ResponseBody
    @RequestMapping(value = "/other.do")
    public String doother(HttpServletRequest request) throws UnsupportedEncodingException {
        //处理some.do请求了
//        request.setCharacterEncoding("utf-8");
        Map map = new HashMap<>();
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        map.put("name",name);
        map.put("age",age);
        String res = JSON.toJSONString(map);
        return res;
    }

    @RequestMapping("/third.do")
    public ModelAndView dothird(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("/show.jsp");
        return mv;
    }
    @ResponseBody
    @RequestMapping("/student.do")
    public String dostudent(Student student){
        String res = null;
        System.out.println(student.getAge());
        System.out.println(student.getName());
        Map<String,String> map = new HashMap<>();
        map.put("name",student.getName());
        map.put("age",student.getAge());
        res = JSON.toJSONString(map);
        return res;
    }
    @ResponseBody
    @RequestMapping(value = "/student1.do",method = RequestMethod.POST)
    public String dostudent1(Student student){
        String res = null;
        System.out.println(student.getAge());
        System.out.println(student.getName());
        Map<String,String> map = new HashMap<>();
        map.put("name",student.getName());
        map.put("age",student.getAge());
        res = JSON.toJSONString(map);
        return res;
    }
    @RequestMapping(value = "/tiaozhuan.do",method = RequestMethod.POST)
    public String dostudent2(Student student){
        String res = null;
        System.out.println(student.getAge());
        System.out.println(student.getName());
        Map<String,String> map = new HashMap<>();
        map.put("name",student.getName());
        map.put("age",student.getAge());
        res = JSON.toJSONString(map);
        if (student.getAge().equals("20")){
            res = "index.jsp";
        }else{
            res = "show.jsp";
        }

        return res;
    }
}
