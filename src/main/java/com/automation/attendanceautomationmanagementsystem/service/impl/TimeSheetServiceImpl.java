package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.TimeSheet;
import com.automation.attendanceautomationmanagementsystem.repository.TimeSheetRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TimeSheetServiceImpl extends AbstractBaseServiceImpl<TimeSheet, TimeSheetRepository> implements JpaRepository<TimeSheet, Long> {
    public TimeSheetServiceImpl(TimeSheetRepository repository) {
        super(repository);
    }
}