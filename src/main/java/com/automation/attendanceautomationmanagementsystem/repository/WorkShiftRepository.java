package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkShiftRepository extends JpaRepository<WorkShift, Long> {
}
