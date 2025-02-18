package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;
import com.automation.attendanceautomationmanagementsystem.repository.BachelorDegreeRepository;
import com.automation.attendanceautomationmanagementsystem.service.BachelorDegreeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BachelorDegreeServiceImpl implements BachelorDegreeService
{
    private final BachelorDegreeRepository bachelorDegreeRepository;

    public BachelorDegreeServiceImpl(BachelorDegreeRepository bachelorDegreeRepository) {
        this.bachelorDegreeRepository = bachelorDegreeRepository;
    }

    @Override
    public BachelorDegree save(BachelorDegree bachelorDegree) {
        return bachelorDegreeRepository.save(bachelorDegree);
    }

    @Override
    public BachelorDegree update(BachelorDegree bachelorDegree) {
        return bachelorDegreeRepository.save(bachelorDegree);
    }

    @Override
    public void deleteById(Long id) {
        bachelorDegreeRepository.deleteById(id);
    }

    @Override
    public BachelorDegree findById(Long id) {
        return bachelorDegreeRepository.findById(id).orElse(null);
    }

    @Override
    public List<BachelorDegree> findAll() {
        return bachelorDegreeRepository.findAll();
    }
}