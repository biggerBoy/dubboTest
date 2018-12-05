package com.yya;

import com.yya.entity.Student;
import com.yya.result.ResultSet;
import com.yya.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
    public ResultSet<Student> getData(String name){
        ResultSet<Student> resultSet = new ResultSet<Student>();
        Student student = new Student(name);
        student.setAddress("beijing");
        student.setAge(12);
        student.setSex("M");
        resultSet.setT(student);
        resultSet.setCode("AAAAAAA");
        resultSet.setMsg("success");
        resultSet.setError(false);
        resultSet.setFlow("20181204150823");
        return resultSet;
    }
}
