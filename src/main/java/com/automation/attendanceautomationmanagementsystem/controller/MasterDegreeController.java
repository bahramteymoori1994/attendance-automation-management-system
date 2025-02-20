package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.MasterDegreeServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/master_degree")
public class MasterDegreeController extends AbstractBaseController<MasterDegree, MasterDegreeServiceImpl>
{
    public MasterDegreeController(MasterDegreeServiceImpl service) {
        super(service);
    }
}