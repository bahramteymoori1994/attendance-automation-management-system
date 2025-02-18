package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.DiplomaDegree;

import java.util.List;

public interface DiplomaDegreeService
{
    DiplomaDegree save(DiplomaDegree diplomaDegree);
    DiplomaDegree update(DiplomaDegree diplomaDegree);
    void deleteById(Long id);
    DiplomaDegree findById(Long id);
    List<DiplomaDegree> findAll();
}