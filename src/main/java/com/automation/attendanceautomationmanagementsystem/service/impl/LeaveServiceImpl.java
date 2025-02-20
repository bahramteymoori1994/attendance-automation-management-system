package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Leave;
import com.automation.attendanceautomationmanagementsystem.repository.LeaveRepository;
import org.springframework.stereotype.Service;

@Service
public class LeaveServiceImpl extends AbstractBaseServiceImpl<Leave, LeaveRepository>
{
    public LeaveServiceImpl(LeaveRepository repository) {
        super(repository);
    }
}