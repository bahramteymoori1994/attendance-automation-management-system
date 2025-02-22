package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.WorkHistory;
import com.automation.attendanceautomationmanagementsystem.service.impl.WorkHistoryServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work_history")
public class WorkHistoryController extends AbstractBaseController<WorkHistory, WorkHistoryServiceImpl>{
    public WorkHistoryController(WorkHistoryServiceImpl service) {
        super(service);
    }
}
