package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.WorkHistory;
import com.automation.attendanceautomationmanagementsystem.repository.WorkHistoryRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkHistoryServiceImpl extends AbstractBaseServiceImpl<WorkHistory, WorkHistoryRepository>{
    public WorkHistoryServiceImpl(WorkHistoryRepository repository) {
        super(repository);
    }
}
