package cn.bigbaic.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * <h3>spirngmvc-study</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-26 16:46
 **/


@Controller
@RequestMapping(value = "/test")
public class MyController {

    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView dosome(){
        //处理some.do请求了
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用mvc开发");

        mv.setViewName("/show.jsp");

        return mv;
    }
    @RequestMapping(value = "/other.do",method = RequestMethod.GET)
    public ModelAndView doother(){
        //处理some.do请求了
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用mvc开发");

        mv.setViewName("/other.jsp");

        return mv;
    }
    @ResponseBody
    @RequestMapping(value = "/service.do",method = RequestMethod.GET)
    public String  doother(HttpServletRequest request){
        //处理some.do请求了
        String s = request.getParameter("name");
        return s;
    }

}
