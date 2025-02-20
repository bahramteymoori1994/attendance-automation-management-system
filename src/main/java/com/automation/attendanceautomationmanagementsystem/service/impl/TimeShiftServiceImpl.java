package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.TimeShift;
import com.automation.attendanceautomationmanagementsystem.repository.TimeShiftRepository;
import org.springframework.stereotype.Service;

@Service
public class TimeShiftServiceImpl extends AbstractBaseServiceImpl<TimeShift, TimeShiftRepository>
{
    public TimeShiftServiceImpl(TimeShiftRepository repository) {
        super(repository);
    }
}