package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import com.automation.attendanceautomationmanagementsystem.model.enums.WorkShiftType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkShiftRepository extends JpaRepository<WorkShift, Long>
{
    WorkShift findWorkShiftByWorkShiftCode(String workShiftCode);
    List<WorkShift> findWorkShiftByName(String workShiftName);
    List<WorkShift> findWorkShiftByWorkShiftType(WorkShiftType workShiftType);
}