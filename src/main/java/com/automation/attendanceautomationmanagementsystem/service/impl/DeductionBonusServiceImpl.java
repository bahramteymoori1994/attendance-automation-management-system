package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.controller.DeductionBonus;
import com.automation.attendanceautomationmanagementsystem.repository.DeductionBonusRepository;
import com.automation.attendanceautomationmanagementsystem.service.DeductionBonusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeductionBonusServiceImpl implements DeductionBonusService
{
    private final DeductionBonusRepository deductionBonusRepository;

    public DeductionBonusServiceImpl(DeductionBonusRepository deductionBonusRepository) {
        this.deductionBonusRepository = deductionBonusRepository;
    }

    @Override
    public DeductionBonus save(DeductionBonus deductionBonus) {
        return deductionBonusRepository.save(deductionBonus);
    }

    @Override
    public DeductionBonus update(DeductionBonus deductionBonus) {
        return deductionBonusRepository.save(deductionBonus);
    }

    @Override
    public void deleteById(Long id) {
        deductionBonusRepository.deleteById(id);
    }

    @Override
    public DeductionBonus findById(Long id) {
        return deductionBonusRepository.findById(id).orElse(null);
    }

    @Override
    public List<DeductionBonus> findAll() {
        return deductionBonusRepository.findAll();
    }
}