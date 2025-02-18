package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.TimeSheet;
import com.automation.attendanceautomationmanagementsystem.repository.TimeSheetRepository;
import com.automation.attendanceautomationmanagementsystem.service.TimeSheetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeSheetServiceImpl implements TimeSheetService
{
    private final TimeSheetRepository timeSheetRepository;

    public TimeSheetServiceImpl(TimeSheetRepository timeSheetRepository) {
        this.timeSheetRepository = timeSheetRepository;
    }

    @Override
    public TimeSheet save(TimeSheet timeSheet) {
        return timeSheetRepository.save(timeSheet);
    }

    @Override
    public TimeSheet update(TimeSheet timeSheet) {
        return timeSheetRepository.save(timeSheet);
    }

    @Override
    public void deleteById(Long id) {
        timeSheetRepository.deleteById(id);
    }

    @Override
    public TimeSheet findById(Long id) {
        return timeSheetRepository.findById(id).orElse(null);
    }

    @Override
    public List<TimeSheet> findAll() {
        return timeSheetRepository.findAll();
    }
}