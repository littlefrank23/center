package com.mycom.center.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Desscription: TODO
 * @Author: Teng
 * @Date: 2019/9/23 11:08
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello";
    }
}
