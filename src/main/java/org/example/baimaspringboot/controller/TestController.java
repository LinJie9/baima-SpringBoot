package org.example.baimaspringboot.controller;

import org.example.baimaspringboot.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

//    @Value("${test.hello}")
//    String hello;

    @ResponseBody
    @GetMapping("/")
    public String index(){
        return "Hellow World";
    }
//    public Student index(){
//        return "Hello World";
//        return new Student(1, "小明", "男");
//
//    }
}
