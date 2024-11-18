package com.example.signupapp.controller;

import com.example.signupapp.model.User;
import com.example.signupapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String showSignupForm() {
        return "signup";
    }

    @RequestMapping("/signup")
    public String registerUser(@ModelAttribute User user, Model model) {
        userRepository.save(user);
        model.addAttribute("message", "User registered successfully!");
        return "signup";
    }
}
