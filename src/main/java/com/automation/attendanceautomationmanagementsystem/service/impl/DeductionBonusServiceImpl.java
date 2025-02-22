package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.DeductionBonus;
import com.automation.attendanceautomationmanagementsystem.model.enums.DeductionType;
import com.automation.attendanceautomationmanagementsystem.repository.DeductionBonusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeductionBonusServiceImpl extends AbstractBaseServiceImpl<DeductionBonus, DeductionBonusRepository>
{
    private final DeductionBonusRepository deductionBonusRepository;

    public DeductionBonusServiceImpl(DeductionBonusRepository repository, DeductionBonusRepository deductionBonusRepository) {
        super(repository);
        this.deductionBonusRepository = deductionBonusRepository;
    }

    public List<DeductionBonus> findDeductionBonusByDeductionType(DeductionType type)
    {
        return deductionBonusRepository.findDeductionBonusByDeductionType(type);
    }
}