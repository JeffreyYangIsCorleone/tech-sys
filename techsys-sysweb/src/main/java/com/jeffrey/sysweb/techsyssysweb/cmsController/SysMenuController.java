package com.jeffrey.sysweb.techsyssysweb.cmsController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sys/")
public class SysMenuController {

    @RequestMapping("g_login")
    public String goToLoginPage(){
        System.out.println("...");
        return "login";
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "login";
    }
}
