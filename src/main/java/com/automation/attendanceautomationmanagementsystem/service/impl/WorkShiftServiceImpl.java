package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import com.automation.attendanceautomationmanagementsystem.repository.WorkShiftRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkShiftServiceImpl extends AbstractBaseServiceImpl<WorkShift, WorkShiftRepository>
{
    public WorkShiftServiceImpl(WorkShiftRepository repository) {
        super(repository);
    }
}