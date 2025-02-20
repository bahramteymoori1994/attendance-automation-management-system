package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.TimeShift;
import com.automation.attendanceautomationmanagementsystem.service.impl.TimeShiftServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time_shift")
public class TimeShiftController extends AbstractBaseController<TimeShift, TimeShiftServiceImpl>
{
    public TimeShiftController(TimeShiftServiceImpl service) {
        super(service);
    }
}