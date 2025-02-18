package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;
import com.automation.attendanceautomationmanagementsystem.repository.MasterDegreeRepository;
import com.automation.attendanceautomationmanagementsystem.service.MasterDegreeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterDegreeServiceImpl implements MasterDegreeService
{
    private final MasterDegreeRepository masterDegreeRepository;

    public MasterDegreeServiceImpl(MasterDegreeRepository masterDegreeRepository) {
        this.masterDegreeRepository = masterDegreeRepository;
    }

    @Override
    public MasterDegree save(MasterDegree masterDegree) {
        return masterDegreeRepository.save(masterDegree);
    }

    @Override
    public MasterDegree update(MasterDegree masterDegree) {
        return masterDegreeRepository.save(masterDegree);
    }

    @Override
    public void deleteById(Long id) {
        masterDegreeRepository.deleteById(id);
    }

    @Override
    public MasterDegree findById(Long id) {
        return masterDegreeRepository.findById(id).orElse(null);
    }

    @Override
    public List<MasterDegree> findAll() {
        return masterDegreeRepository.findAll();
    }
}