package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.PhdDegree;
import com.automation.attendanceautomationmanagementsystem.repository.PhdDegreeRepository;
import org.springframework.stereotype.Service;

@Service
public class PhdDegreeServiceImpl extends AbstractBaseServiceImpl<PhdDegree, PhdDegreeRepository>
{
    public PhdDegreeServiceImpl(PhdDegreeRepository repository) {
        super(repository);
    }
}