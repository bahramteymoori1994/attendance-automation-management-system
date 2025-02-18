package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.TimeShift;

import java.util.List;

public interface TimeShiftService
{
    TimeShift save(TimeShift timeShift);
    TimeShift update(TimeShift timeShift);
    void deleteById(Long id);
    TimeShift findById(Long id);
    List<TimeShift> findAll();
}