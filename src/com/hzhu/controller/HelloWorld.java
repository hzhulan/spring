package com.hzhu.controller;

import com.hzhu.utils.ConstParams;
import com.hzhu.utils.LogUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @authod: pp_lan on 2018/4/27.
 */
@Controller
public class HelloWorld {

    @RequestMapping("/helloworld")
    public String Helloworld() {
        return "helloworld";
    }

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView model) {
        model.setViewName("index");
        model.addObject("msg","25 age young man!");

        LogUtil.debug("index");
        LogUtil.debug("index invoke", ConstParams.MODULE_NAME);

        return model;
    }
}
