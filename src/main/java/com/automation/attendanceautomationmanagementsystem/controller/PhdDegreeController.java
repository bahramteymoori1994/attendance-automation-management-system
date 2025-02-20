package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.PhdDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.PhdDegreeServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phd_degree")
public class PhdDegreeController extends AbstractBaseController<PhdDegree, PhdDegreeServiceImpl>
{
    public PhdDegreeController(PhdDegreeServiceImpl service) {
        super(service);
    }
}