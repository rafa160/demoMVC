package com.register.demo.controller;

import com.register.demo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/text")
public class TextController {

    //need a controller method to show initial html

    @RequestMapping("/textForm")
    public String showNameForm(Model model){
        model.addAttribute("user",new User());
        return "text-form";
    }


    // controller to process the html
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute User ser){
        return "text-result";
    }

    //method to change the from submited
    @RequestMapping("/processFormUpdated")
    public String changeForm(HttpServletRequest request, Model model, User user){
        //covert to all Caps and create a new message
        String nickName = request.getParameter("nickName");
        nickName = nickName.toUpperCase();
        String result = "Your Nickname is " + nickName;
        model.addAttribute("message", result);
        return "text-result";
    }


}
