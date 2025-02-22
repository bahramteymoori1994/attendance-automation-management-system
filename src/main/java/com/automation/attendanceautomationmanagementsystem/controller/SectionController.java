package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Section;
import com.automation.attendanceautomationmanagementsystem.service.impl.SectionServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/section")
public class SectionController extends AbstractBaseController<Section, SectionServiceImpl>{
    public SectionController(SectionServiceImpl service) {
        super(service);
    }
}
