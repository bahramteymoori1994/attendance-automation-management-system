package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Department;
import com.automation.attendanceautomationmanagementsystem.model.Organization;
import com.automation.attendanceautomationmanagementsystem.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl extends AbstractBaseServiceImpl<Department, DepartmentRepository>{

    private final DepartmentRepository departmentRepository;
    public DepartmentServiceImpl(DepartmentRepository repository, DepartmentRepository departmentRepository) {
        super(repository);
        this.departmentRepository = departmentRepository;
    }

    public List<Department> findDepartmentByName(String name){
        return departmentRepository.findDepartmentByName(name);
    }
    public List<Department> findDepartmentByAddress(String address){
        return departmentRepository.findDepartmentByAddress(address);
    }
    public Department findDepartmentByPhoneNumber(String phoneNumber){
        return departmentRepository.findDepartmentByPhoneNumber(phoneNumber);
    }
    public List<Department> findDepartmentByDescription(String description){
        return departmentRepository.findDepartmentByDescription(description);
    }
    public List<Department> findDepartmentByTask(String task){
        return departmentRepository.findDepartmentByTask(task);
    }
    public Department findDepartmentByOrganization(Organization organization){
        return departmentRepository.findDepartmentByOrganization(organization);
    }
}
