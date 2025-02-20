package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.DeductionBonus;
import com.automation.attendanceautomationmanagementsystem.repository.DeductionBonusRepository;
import org.springframework.stereotype.Service;

@Service
public class DeductionBonusServiceImpl extends AbstractBaseServiceImpl<DeductionBonus, DeductionBonusRepository>
{
    public DeductionBonusServiceImpl(DeductionBonusRepository repository) {
        super(repository);
    }
}