package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;

import java.util.List;

public interface BachelorDegreeService
{
    BachelorDegree save(BachelorDegree bachelorDegree);
    BachelorDegree update(BachelorDegree bachelorDegree);
    void deleteById(Long id);
    BachelorDegree findById(Long id);
    List<BachelorDegree> findAll();
}