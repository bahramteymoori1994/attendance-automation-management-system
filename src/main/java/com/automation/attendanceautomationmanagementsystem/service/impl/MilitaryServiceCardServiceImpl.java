package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.MilitaryServiceCard;
import com.automation.attendanceautomationmanagementsystem.repository.MilitaryServiceCardRepository;
import org.springframework.stereotype.Service;

@Service
public class MilitaryServiceCardServiceImpl extends AbstractBaseServiceImpl<MilitaryServiceCard, MilitaryServiceCardRepository>{
    public MilitaryServiceCardServiceImpl(MilitaryServiceCardRepository repository) {
        super(repository);
    }
}
