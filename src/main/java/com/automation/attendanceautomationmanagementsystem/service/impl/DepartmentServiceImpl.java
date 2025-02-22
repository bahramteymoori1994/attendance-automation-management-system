package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Department;
import com.automation.attendanceautomationmanagementsystem.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends AbstractBaseServiceImpl<Department, DepartmentRepository>{
    public DepartmentServiceImpl(DepartmentRepository repository) {
        super(repository);
    }
}
