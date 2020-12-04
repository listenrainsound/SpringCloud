package com.han.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基本controller
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @GetMapping("/hello")
    public String helloWorld(String s) {
        System.out.println("传入的值为"+s);
        return "传入的值为"+s;
    }
}
