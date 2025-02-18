package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.ExtraShiftTime;

import java.util.List;

public interface ExtraShiftTimeService
{
    ExtraShiftTime save(ExtraShiftTime extraShiftTime);
    ExtraShiftTime update(ExtraShiftTime extraShiftTime);
    void deleteById(Long id);
    ExtraShiftTime findById(Long id);
    List<ExtraShiftTime> findAll();
}