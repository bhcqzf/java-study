package cn.bigbaic.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <h3>spirngmvc-study</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-26 16:46
 **/

@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(){
        //处理some.do请求了
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用mvc开发");

        mv.setViewName("/show.jsp");

        return mv;
    }
}
