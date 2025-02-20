package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.ExtraShiftTime;
import com.automation.attendanceautomationmanagementsystem.repository.ExtraShiftTimeRepository;
import org.springframework.stereotype.Service;

@Service
public class ExtraShiftTimeServiceImpl extends AbstractBaseServiceImpl<ExtraShiftTime, ExtraShiftTimeRepository>
{
    public ExtraShiftTimeServiceImpl(ExtraShiftTimeRepository repository) {
        super(repository);
    }
}