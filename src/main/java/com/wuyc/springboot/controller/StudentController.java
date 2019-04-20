package com.wuyc.springboot.controller;

import com.wuyc.springboot.mapper.StudentMapper;
import com.wuyc.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("listStudent")
    public String listStudent(Model model){
        List<Student> list = studentMapper.findAll();
        model.addAttribute("students",list);
        return "listStudent";
    }
}
