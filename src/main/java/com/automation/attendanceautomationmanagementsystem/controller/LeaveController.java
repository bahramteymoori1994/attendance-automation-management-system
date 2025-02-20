package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Leave;
import com.automation.attendanceautomationmanagementsystem.service.impl.LeaveServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("leave")
public class LeaveController extends AbstractBaseController<Leave, LeaveServiceImpl>
{
    public LeaveController(LeaveServiceImpl service) {
        super(service);
    }
}