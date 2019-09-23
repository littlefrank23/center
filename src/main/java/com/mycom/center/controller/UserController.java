package com.mycom.center.controller;

import com.mycom.center.entry.User;
import com.mycom.center.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Desscription: TODO
 * @Author: Teng
 * @Date: 2019/9/23 15:41
 **/
@RestController
@RequestMapping("/center/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userServiceImpl;

    @GetMapping("/get/{id}")
    public String getUserById(@PathVariable Integer id){
        User user = userServiceImpl.getUserById(id);
        logger.info(user.toString());
        return user.toString();
    }
}
