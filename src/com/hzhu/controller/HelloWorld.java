package com.hzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @authod: pp_lan on 2018/4/27.
 */
@Controller
public class HelloWorld {

    @RequestMapping("/helloworld")
    public String Helloworld() {
        return "helloworld";
    }
}
