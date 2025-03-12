package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Permission;
import com.automation.attendanceautomationmanagementsystem.model.Role;
import com.automation.attendanceautomationmanagementsystem.repository.PermissionRepository;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends AbstractBaseServiceImpl<Permission, PermissionRepository>{

    private final PermissionRepository permissionRepository;

    public PermissionServiceImpl(PermissionRepository repository, PermissionRepository permissionRepository) {
        super(repository);
        this.permissionRepository = permissionRepository;
    }

    public Permission findByPermission(String permission){
        return permissionRepository.findByPermission(permission);
    }
    public Permission findPermissionByRole(Role role){
        return permissionRepository.findPermissionByRole(role);
    }
}
