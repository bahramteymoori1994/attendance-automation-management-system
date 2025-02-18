package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.PhdDegree;
import com.automation.attendanceautomationmanagementsystem.repository.PhdDegreeRepository;
import com.automation.attendanceautomationmanagementsystem.service.PhdDegreeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhdDegreeServiceImpl implements PhdDegreeService
{
    private final PhdDegreeRepository phdDegreeRepository;

    public PhdDegreeServiceImpl(PhdDegreeRepository phdDegreeRepository) {
        this.phdDegreeRepository = phdDegreeRepository;
    }

    @Override
    public PhdDegree save(PhdDegree phdDegree) {
        return phdDegreeRepository.save(phdDegree);
    }

    @Override
    public PhdDegree update(PhdDegree phdDegree) {
        return phdDegreeRepository.save(phdDegree);
    }

    @Override
    public void deleteById(Long id) {
        phdDegreeRepository.deleteById(id);
    }

    @Override
    public PhdDegree findById(Long id) {
        return phdDegreeRepository.findById(id).orElse(null);
    }

    @Override
    public List<PhdDegree> findAll() {
        return phdDegreeRepository.findAll();
    }
}