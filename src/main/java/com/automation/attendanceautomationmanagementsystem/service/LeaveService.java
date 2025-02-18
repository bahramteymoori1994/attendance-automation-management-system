package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.Leave;

import java.util.List;

public interface LeaveService
{
    Leave save(Leave leave);
    Leave update(Leave leave);
    void deleteById(Long id);
    Leave findById(Long id);
    List<Leave> findAll();
}