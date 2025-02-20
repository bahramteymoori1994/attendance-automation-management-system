package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;
import com.automation.attendanceautomationmanagementsystem.repository.BachelorDegreeRepository;
import org.springframework.stereotype.Service;

@Service
public class BachelorDegreeServiceImpl extends AbstractBaseServiceImpl<BachelorDegree, BachelorDegreeRepository>
{
    public BachelorDegreeServiceImpl(BachelorDegreeRepository repository) {
        super(repository);
    }
}