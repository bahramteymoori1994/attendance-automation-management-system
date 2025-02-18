package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.ExtraShiftTime;
import com.automation.attendanceautomationmanagementsystem.repository.ExtraShiftTimeRepository;
import com.automation.attendanceautomationmanagementsystem.service.ExtraShiftTimeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtraShiftTimeServiceImpl implements ExtraShiftTimeService
{
    private final ExtraShiftTimeRepository extraShiftTimeRepository;

    public ExtraShiftTimeServiceImpl(ExtraShiftTimeRepository extraShiftTimeRepository) {
        this.extraShiftTimeRepository = extraShiftTimeRepository;
    }

    @Override
    public ExtraShiftTime save(ExtraShiftTime extraShiftTime) {
        return extraShiftTimeRepository.save(extraShiftTime);
    }

    @Override
    public ExtraShiftTime update(ExtraShiftTime extraShiftTime) {
        return extraShiftTimeRepository.save(extraShiftTime);
    }

    @Override
    public void deleteById(Long id) {
        extraShiftTimeRepository.deleteById(id);
    }

    @Override
    public ExtraShiftTime findById(Long id) {
        return extraShiftTimeRepository.findById(id).orElse(null);
    }

    @Override
    public List<ExtraShiftTime> findAll() {
        return extraShiftTimeRepository.findAll();
    }
}