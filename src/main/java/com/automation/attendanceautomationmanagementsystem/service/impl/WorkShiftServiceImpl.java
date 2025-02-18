package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import com.automation.attendanceautomationmanagementsystem.repository.WorkShiftRepository;
import com.automation.attendanceautomationmanagementsystem.service.WorkShiftService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkShiftServiceImpl implements WorkShiftService
{
    private final WorkShiftRepository workShiftRepository;

    public WorkShiftServiceImpl(WorkShiftRepository workShiftRepository) {
        this.workShiftRepository = workShiftRepository;
    }

    @Override
    public WorkShift save(WorkShift workShift) {
        return workShiftRepository.save(workShift);
    }

    @Override
    public WorkShift update(WorkShift workShift) {
        return workShiftRepository.save(workShift);
    }

    @Override
    public void deleteById(Long id) {
        workShiftRepository.deleteById(id);
    }

    @Override
    public WorkShift findById(Long id) {
        return workShiftRepository.findById(id).orElse(null);
    }

    @Override
    public List<WorkShift> findAll() {
        return workShiftRepository.findAll();
    }
}