package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;
import com.automation.attendanceautomationmanagementsystem.repository.MasterDegreeRepository;
import org.springframework.stereotype.Service;

@Service
public class MasterDegreeServiceImpl extends AbstractBaseServiceImpl<MasterDegree, MasterDegreeRepository>
{
    public MasterDegreeServiceImpl(MasterDegreeRepository repository) {
        super(repository);
    }
}