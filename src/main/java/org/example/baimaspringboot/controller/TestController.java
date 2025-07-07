package org.example.baimaspringboot.controller;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.example.baimaspringboot.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Slf4j
@Controller
public class TestController {


    @PostConstruct
    public void init(){
        log.info("欢迎来到卢本伟广场");
    }

//    @PostConstruct
//    public void init(){
//        Logger logger = Logger.getLogger("test");
//        logger.info("Hello World");
//    }

//    @Value("${test.hello}")
//    String hello;

//    @ResponseBody
//    @GetMapping("/")
//    public String index(){
//        return "Hellow World";
//    }
//    public Student index(){
//        return "Hello World";
//        return new Student(1, "小明", "男");
//
//    }
}
