package cn.bigbaic.controller;

import cn.bigbaic.vo.Student;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
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
}
