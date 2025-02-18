package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.controller.DeductionBonus;

import java.util.List;

public interface DeductionBonusService
{
    DeductionBonus save(DeductionBonus deductionBonus);
    DeductionBonus update(DeductionBonus deductionBonus);
    void deleteById(Long id);
    DeductionBonus findById(Long id);
    List<DeductionBonus> findAll();
}