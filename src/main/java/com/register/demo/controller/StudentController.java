package com.register.demo.controller;

import com.register.demo.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        //create student obj and add to de model

        Student student = new Student();

        model.addAttribute("student", student);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){
        //log the input data and Caps the first letter

        String firstName = student.getFirstName().substring(0,1).toUpperCase() + student.getFirstName().substring(1).toLowerCase();
        String lastName = student.getLastName().substring(0,1).toUpperCase() + student.getLastName().substring(1).toLowerCase();

        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setCountry(student.getCountry());
        student.setFavLanguage(student.getFavLanguage());
        return "student-confirmation";
    }

}
