package com.automation.attendanceautomationmanagementsystem.controller;


import com.automation.attendanceautomationmanagementsystem.model.DrivingLicense;
import com.automation.attendanceautomationmanagementsystem.service.impl.DrivingLicenseServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driving_license")
public class DrivingLicenseController extends AbstractBaseController<DrivingLicense, DrivingLicenseServiceImpl>{
    public DrivingLicenseController(DrivingLicenseServiceImpl service) {
        super(service);
    }
}
