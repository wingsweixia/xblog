package com.weixia.xblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/xBlogManager/index")
public class MainController {

    @RequestMapping("/mainpage")
    public String toMainPage(Model model){
        return "main";
    }

}
