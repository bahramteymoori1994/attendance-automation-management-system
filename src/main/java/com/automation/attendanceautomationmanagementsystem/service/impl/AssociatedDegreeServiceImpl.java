package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.AssociatedDegree;
import com.automation.attendanceautomationmanagementsystem.repository.AssociatedDegreeRepository;
import org.springframework.stereotype.Service;

@Service
public class AssociatedDegreeServiceImpl extends AbstractBaseServiceImpl<AssociatedDegree, AssociatedDegreeRepository>
{
    public AssociatedDegreeServiceImpl(AssociatedDegreeRepository repository) {
        super(repository);
    }
}