package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.DiplomaDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.DiplomaDegreeServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diploma_degree")
public class DiplomaDegreeController extends AbstractBaseController<DiplomaDegree, DiplomaDegreeServiceImpl>
{
    public DiplomaDegreeController(DiplomaDegreeServiceImpl service) {
        super(service);
    }
}