package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Mission;
import com.automation.attendanceautomationmanagementsystem.repository.MissionRepository;
import org.springframework.stereotype.Service;

@Service
public class MissionServiceImpl extends AbstractBaseServiceImpl<Mission, MissionRepository>
{
    public MissionServiceImpl(MissionRepository repository) {
        super(repository);
    }
}