package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.MedicalHistory;
import com.automation.attendanceautomationmanagementsystem.service.impl.MedicalHistoryServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medical_history")
public class MedicalHistoryController extends AbstractBaseController<MedicalHistory, MedicalHistoryServiceImpl>{
    public MedicalHistoryController(MedicalHistoryServiceImpl service) {
        super(service);
    }
}
