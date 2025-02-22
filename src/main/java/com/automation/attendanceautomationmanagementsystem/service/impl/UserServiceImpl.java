package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.User;
import com.automation.attendanceautomationmanagementsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractBaseServiceImpl<User, UserRepository>{
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
