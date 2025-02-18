package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.TimeShift;
import com.automation.attendanceautomationmanagementsystem.repository.TimeShiftRepository;
import com.automation.attendanceautomationmanagementsystem.service.TimeShiftService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeShiftServiceImpl implements TimeShiftService
{
    private final TimeShiftRepository timeShiftRepository;

    public TimeShiftServiceImpl(TimeShiftRepository timeShiftRepository) {
        this.timeShiftRepository = timeShiftRepository;
    }

    @Override
    public TimeShift save(TimeShift timeShift) {
        return timeShiftRepository.save(timeShift);
    }

    @Override
    public TimeShift update(TimeShift timeShift) {
        return timeShiftRepository.save(timeShift);
    }

    @Override
    public void deleteById(Long id) {
        timeShiftRepository.deleteById(id);
    }

    @Override
    public TimeShift findById(Long id) {
        return timeShiftRepository.findById(id).orElse(null);
    }

    @Override
    public List<TimeShift> findAll() {
        return timeShiftRepository.findAll();
    }
}