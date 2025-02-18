package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.AssociatedDegree;

import java.util.List;

public interface AssociatedDegreeService
{
    AssociatedDegree save(AssociatedDegree associatedDegree);
    AssociatedDegree update(AssociatedDegree associatedDegree);
    void deleteById(Long id);
    AssociatedDegree findById(Long id);
    List<AssociatedDegree> findAll();
}