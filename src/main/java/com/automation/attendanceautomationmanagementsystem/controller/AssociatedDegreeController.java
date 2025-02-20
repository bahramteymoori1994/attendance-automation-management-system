package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.AssociatedDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.AssociatedDegreeServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/associated_degree")
public class AssociatedDegreeController extends AbstractBaseController<AssociatedDegree, AssociatedDegreeServiceImpl>
{
    public AssociatedDegreeController(AssociatedDegreeServiceImpl service) {
        super(service);
    }
}