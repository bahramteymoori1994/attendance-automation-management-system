package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.model.PhdDegree;

import java.util.List;

public interface PhdDegreeService
{
    PhdDegree save(PhdDegree phdDegree);
    PhdDegree update(PhdDegree phdDegree);
    void deleteById(Long id);
    PhdDegree findById(Long id);
    List<PhdDegree> findAll();
}