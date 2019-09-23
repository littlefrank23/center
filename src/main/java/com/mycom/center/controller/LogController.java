package com.mycom.center.controller;

import com.mycom.center.entry.User;
import com.mycom.center.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: LogController
 * @Desscription: TODO
 * @Author: Teng
 * @Date: 2019/9/23 17:05
 **/
@RestController
@RequestMapping("/center")
public class LogController {

    Logger logger = LoggerFactory.getLogger(LogController.class);

    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping("/login")
    public String login(){
        User user = userServiceImpl.getUserByNameAndPwd("teng","123");

        return user.toString();
    }
}
