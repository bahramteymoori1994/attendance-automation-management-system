package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.DrivingLicense;
import com.automation.attendanceautomationmanagementsystem.repository.DrivingLicenseRepository;
import org.springframework.stereotype.Service;

@Service
public class DrivingLicenseServiceImpl extends AbstractBaseServiceImpl<DrivingLicense, DrivingLicenseRepository>{
    public DrivingLicenseServiceImpl(DrivingLicenseRepository repository) {
        super(repository);
    }
}
