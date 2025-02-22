package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Section;
import com.automation.attendanceautomationmanagementsystem.repository.SectionRepository;
import org.springframework.stereotype.Service;

@Service
public class SectionServiceImpl extends AbstractBaseServiceImpl<Section, SectionRepository>{
    public SectionServiceImpl(SectionRepository repository) {
        super(repository);
    }
}
