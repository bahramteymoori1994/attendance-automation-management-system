package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Role;
import com.automation.attendanceautomationmanagementsystem.model.User;
import com.automation.attendanceautomationmanagementsystem.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractBaseServiceImpl<Role, RoleRepository>{

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository repository, RoleRepository roleRepository) {
        super(repository);
        this.roleRepository = roleRepository;
    }


//    public List<Role> findByUser(User user) {
//        return roleRepository.findByUsersSetContaining(user);
//    }
//
//    public List<Role> findByUserName(String userName) {
//        return roleRepository.findByUsersSetRoles(userName);
//    }

    public Role findByName(String roleName) {
        return roleRepository.findByName(roleName);
    }
}
