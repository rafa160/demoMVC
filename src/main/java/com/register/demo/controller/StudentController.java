package com.register.demo.controller;

import com.register.demo.models.Student;
import com.register.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository repository;

    @RequestMapping("/showForm")
    public String showForm(Model model){
        //create student obj and add to de model
        Student student = new Student();
        model.addAttribute("student", student);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){
        Student studentDB = new Student();
        studentDB.setFirstName(student.getFirstName());
        studentDB.setLastName(student.getLastName());
        studentDB.setLastName(student.getEmail());
//        repository.save(studentDB);
        return "student-confirmation";
    }

}
