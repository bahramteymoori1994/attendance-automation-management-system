package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import com.automation.attendanceautomationmanagementsystem.service.impl.WorkShiftServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/work_shift")
public class WorkShiftController extends AbstractBaseController<WorkShift, WorkShiftServiceImpl>
{
    public WorkShiftController(WorkShiftServiceImpl service) {
        super(service);
    }
}