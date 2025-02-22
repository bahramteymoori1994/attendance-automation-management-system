package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.MilitaryServiceCard;
import com.automation.attendanceautomationmanagementsystem.service.impl.MilitaryServiceCardServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/military_service_card")
public class MilitaryServiceCardController extends AbstractBaseController<MilitaryServiceCard, MilitaryServiceCardServiceImpl>{
    public MilitaryServiceCardController(MilitaryServiceCardServiceImpl service) {
        super(service);
    }
}
