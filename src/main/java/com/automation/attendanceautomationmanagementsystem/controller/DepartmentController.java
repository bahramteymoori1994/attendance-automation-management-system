package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Department;
import com.automation.attendanceautomationmanagementsystem.service.impl.DepartmentServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController extends AbstractBaseController<Department, DepartmentServiceImpl>{
    public DepartmentController(DepartmentServiceImpl service) {
        super(service);
    }
}
