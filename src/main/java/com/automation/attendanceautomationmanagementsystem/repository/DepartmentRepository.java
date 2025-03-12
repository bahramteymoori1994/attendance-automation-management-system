package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.Department;
import com.automation.attendanceautomationmanagementsystem.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findDepartmentByName(String name);
    List<Department> findDepartmentByAddress(String address);
    Department findDepartmentByPhoneNumber(String phoneNumber);
    List<Department> findDepartmentByDescription(String description);
    List<Department> findDepartmentByTask(String task);
    Department findDepartmentByOrganization(Organization organization);
}
