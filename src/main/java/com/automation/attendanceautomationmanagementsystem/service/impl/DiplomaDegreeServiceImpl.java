package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.DiplomaDegree;
import com.automation.attendanceautomationmanagementsystem.repository.DiplomaDegreeRepository;
import com.automation.attendanceautomationmanagementsystem.service.DiplomaDegreeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiplomaDegreeServiceImpl implements DiplomaDegreeService
{
    private final DiplomaDegreeRepository diplomaDegreeRepository;

    public DiplomaDegreeServiceImpl(DiplomaDegreeRepository diplomaDegreeRepository) {
        this.diplomaDegreeRepository = diplomaDegreeRepository;
    }

    @Override
    public DiplomaDegree save(DiplomaDegree diplomaDegree) {
        return diplomaDegreeRepository.save(diplomaDegree);
    }

    @Override
    public DiplomaDegree update(DiplomaDegree diplomaDegree) {
        return diplomaDegreeRepository.save(diplomaDegree);
    }

    @Override
    public void deleteById(Long id) {
        diplomaDegreeRepository.deleteById(id);
    }

    @Override
    public DiplomaDegree findById(Long id) {
        return diplomaDegreeRepository.findById(id).orElse(null);
    }

    @Override
    public List<DiplomaDegree> findAll() {
        return diplomaDegreeRepository.findAll();
    }
}