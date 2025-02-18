package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.AssociatedDegree;
import com.automation.attendanceautomationmanagementsystem.repository.AssociatedDegreeRepository;
import com.automation.attendanceautomationmanagementsystem.service.AssociatedDegreeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociatedDegreeServiceImpl implements AssociatedDegreeService
{
    private final AssociatedDegreeRepository associatedDegreeRepository;

    public AssociatedDegreeServiceImpl(AssociatedDegreeRepository associatedDegreeRepository) {
        this.associatedDegreeRepository = associatedDegreeRepository;
    }

    @Override
    public AssociatedDegree save(AssociatedDegree associatedDegree) {
        return associatedDegreeRepository.save(associatedDegree);
    }

    @Override
    public AssociatedDegree update(AssociatedDegree associatedDegree) {
        return associatedDegreeRepository.save(associatedDegree);
    }

    @Override
    public void deleteById(Long id) {
        associatedDegreeRepository.deleteById(id);
    }

    @Override
    public AssociatedDegree findById(Long id) {
        return associatedDegreeRepository.findById(id).orElse(null);
    }

    @Override
    public List<AssociatedDegree> findAll() {
        return associatedDegreeRepository.findAll();
    }
}