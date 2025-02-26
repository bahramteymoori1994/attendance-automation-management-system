package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
