package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Mission;
import com.automation.attendanceautomationmanagementsystem.service.impl.MissionServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mission")
public class MissionController extends AbstractBaseController<Mission, MissionServiceImpl>
{
    public MissionController(MissionServiceImpl service) {
        super(service);
    }
}