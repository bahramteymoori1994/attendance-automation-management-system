package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.DiplomaDegree;
import com.automation.attendanceautomationmanagementsystem.repository.DiplomaDegreeRepository;
import org.springframework.stereotype.Service;

@Service
public class DiplomaDegreeServiceImpl extends AbstractBaseServiceImpl<DiplomaDegree, DiplomaDegreeRepository>
{
    public DiplomaDegreeServiceImpl(DiplomaDegreeRepository repository) {
        super(repository);
    }
}