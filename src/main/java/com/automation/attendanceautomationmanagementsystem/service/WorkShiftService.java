package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.WorkShift;

import java.util.List;

public interface WorkShiftService
{
    WorkShift save(WorkShift workShift);
    WorkShift update(WorkShift workShift);
    void deleteById(Long id);
    WorkShift findById(Long id);
    List<WorkShift> findAll();
}