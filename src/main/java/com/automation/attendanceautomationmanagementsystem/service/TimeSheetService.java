package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.TimeSheet;

import java.util.List;

public interface TimeSheetService
{
    TimeSheet save(TimeSheet timeSheet);
    TimeSheet update(TimeSheet timeSheet);
    void deleteById(Long id);
    TimeSheet findById(Long id);
    List<TimeSheet> findAll();
}