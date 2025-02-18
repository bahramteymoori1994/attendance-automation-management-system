package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;

import java.util.List;

public interface MasterDegreeService
{
    MasterDegree save(MasterDegree masterDegree);
    MasterDegree update(MasterDegree masterDegree);
    void deleteById(Long id);
    MasterDegree findById(Long id);
    List<MasterDegree> findAll();
}