package com.sau.jwt.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {
    @GetMapping("/signin")
    public String showSigninPage() {
        return "signin/index";
    }
    @GetMapping("/signup")
    public String showSignupPage() {
        return "signup/index";
    }
}
