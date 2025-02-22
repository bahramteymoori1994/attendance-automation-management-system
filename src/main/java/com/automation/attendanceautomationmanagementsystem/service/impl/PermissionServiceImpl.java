package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Permission;
import com.automation.attendanceautomationmanagementsystem.repository.PermissionRepository;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends AbstractBaseServiceImpl<Permission, PermissionRepository>{
    public PermissionServiceImpl(PermissionRepository repository) {
        super(repository);
    }
}
