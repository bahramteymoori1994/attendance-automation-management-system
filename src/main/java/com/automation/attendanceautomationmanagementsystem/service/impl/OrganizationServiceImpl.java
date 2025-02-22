package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Organization;
import com.automation.attendanceautomationmanagementsystem.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl extends AbstractBaseServiceImpl<Organization, OrganizationRepository>{
    public OrganizationServiceImpl(OrganizationRepository repository) {
        super(repository);
    }
}
