package com.grouppay.controller;

import com.grouppay.model.User;
import com.grouppay.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> data, HttpSession session) {
        String username = data.get("username");
        String password = data.get("password");

        boolean success = service.login(username, password);

        if (success) {
            // Get user object and store in session
            User user = service.findByUsername(username);
            session.setAttribute("loggedInUser", user);
            return "SUCCESS";
        }
        return "FAIL";
    }

    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> data) {
        return service.register(data.get("username"), data.get("password")) ? "REGISTERED" : "FAILED";
    }
}