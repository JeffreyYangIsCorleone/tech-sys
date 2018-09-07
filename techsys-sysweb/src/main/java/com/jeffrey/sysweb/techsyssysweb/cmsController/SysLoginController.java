package com.jeffrey.sysweb.techsyssysweb.cmsController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/sys/")
public class SysLoginController {

    private Logger logger = LoggerFactory.getLogger(SysLoginController.class);

    @RequestMapping("check_login")
    public Map<String, Object> checkSysLogin(String account, String password
            , String code) {
        logger.info("account,password,code,{},{},{}", account, password, code);
        return null;
    }
}
