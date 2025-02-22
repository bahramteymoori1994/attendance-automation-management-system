package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.MedicalHistory;
import com.automation.attendanceautomationmanagementsystem.repository.MedicalHistoryRepository;
import org.springframework.stereotype.Service;

@Service
public class MedicalHistoryServiceImpl extends AbstractBaseServiceImpl<MedicalHistory, MedicalHistoryRepository>{
    public MedicalHistoryServiceImpl(MedicalHistoryRepository repository) {
        super(repository);
    }
}
