package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.BachelorDegreeServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bachelor_degree")
public class BachelorDegreeController extends AbstractBaseController<BachelorDegree, BachelorDegreeServiceImpl>
{
    public BachelorDegreeController(BachelorDegreeServiceImpl service) {
        super(service);
    }
}