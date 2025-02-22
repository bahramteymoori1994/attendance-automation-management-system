package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Role;
import com.automation.attendanceautomationmanagementsystem.service.impl.RoleServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController extends AbstractBaseController<Role, RoleServiceImpl>{
    public RoleController(RoleServiceImpl service) {
        super(service);
    }
}
