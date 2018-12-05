package com.yya.controller;

import com.yya.entity.Student;
import com.yya.result.ResultSet;
import com.yya.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DataController {
    Logger logger = Logger.getLogger(DataController.class);
    @Resource
    private TestService testService;
    @ResponseBody
    @RequestMapping("/getData")
    public String getData(String name){
        ResultSet<Student> resultSet = (ResultSet<Student>)testService.getData(name);
        String code = resultSet.getCode();
        Student stu = resultSet.getT();
        String nameBack = stu.getName();
        logger.info("+++++++++返回码是aa："+code+",name:"+nameBack);
        return "success";
    }
}
