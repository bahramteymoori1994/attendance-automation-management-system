package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Permission;
import com.automation.attendanceautomationmanagementsystem.service.impl.PermissionServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permission")
public class PermissionController extends AbstractBaseController<Permission, PermissionServiceImpl>{
    public PermissionController(PermissionServiceImpl service) {
        super(service);
    }
}
