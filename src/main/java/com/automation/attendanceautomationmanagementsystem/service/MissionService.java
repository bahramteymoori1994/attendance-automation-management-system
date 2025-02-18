package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.Mission;

import java.util.List;

public interface MissionService
{
    Mission save(Mission mission);
    Mission update(Mission mission);
    void deleteById(Long id);
    Mission findById(Long id);
    List<Mission> findAll();
}