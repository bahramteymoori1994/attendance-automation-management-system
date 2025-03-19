package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Organization;
import com.automation.attendanceautomationmanagementsystem.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl extends AbstractBaseServiceImpl<Organization, OrganizationRepository>{

    private final OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository repository, OrganizationRepository organizationRepository) {
        super(repository);
        this.organizationRepository = organizationRepository;
    }

    public List<Organization> findOrganizationByName(String name){
        return organizationRepository.findOrganizationByName(name);
    }
    public List<Organization> findOrganizationByAddress(String address){
        return organizationRepository.findOrganizationByAddress(address);
    }
    public Organization findOrganizationByPhoneNumber(String phoneNumber){
        return organizationRepository.findOrganizationByPhoneNumber(phoneNumber);
    }
    public List<Organization> findOrganizationByDescription(String description){
        return organizationRepository.findOrganizationByDescription(description);
    }
    public List<Organization> findOrganizationByTask(String task){
        return organizationRepository.findOrganizationByTask(task);
    }
}
