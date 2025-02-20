package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.ExtraShiftTime;
import com.automation.attendanceautomationmanagementsystem.service.impl.ExtraShiftTimeServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/extra_shift_time")
public class ExtraShiftTimeController extends AbstractBaseController<ExtraShiftTime, ExtraShiftTimeServiceImpl>
{
    public ExtraShiftTimeController(ExtraShiftTimeServiceImpl service) {
        super(service);
    }
}