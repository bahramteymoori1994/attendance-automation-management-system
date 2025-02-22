package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Role;
import com.automation.attendanceautomationmanagementsystem.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends AbstractBaseServiceImpl<Role, RoleRepository>{
    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }
}
