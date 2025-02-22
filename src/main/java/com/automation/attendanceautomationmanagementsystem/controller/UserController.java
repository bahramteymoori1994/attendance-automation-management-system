package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.User;
import com.automation.attendanceautomationmanagementsystem.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractBaseController<User, UserServiceImpl>{
    public UserController(UserServiceImpl service) {
        super(service);
    }
}
