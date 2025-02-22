package com.automation.attendanceautomationmanagementsystem.controller;


import com.automation.attendanceautomationmanagementsystem.model.Organization;
import com.automation.attendanceautomationmanagementsystem.service.impl.OrganizationServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
public class OrganizationController extends AbstractBaseController<Organization, OrganizationServiceImpl>{
    public OrganizationController(OrganizationServiceImpl service) {
        super(service);
    }
}
