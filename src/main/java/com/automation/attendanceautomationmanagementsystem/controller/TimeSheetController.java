package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.TimeSheet;
import com.automation.attendanceautomationmanagementsystem.service.impl.AbstractBaseServiceImpl;
import com.automation.attendanceautomationmanagementsystem.service.impl.TimeSheetServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time_sheet")
public class TimeSheetController extends AbstractBaseServiceImpl<TimeSheet, TimeSheetServiceImpl>
{
    public TimeSheetController(TimeSheetServiceImpl repository) {
        super(repository);
    }
}