package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.DeductionBonus;
import com.automation.attendanceautomationmanagementsystem.service.impl.DeductionBonusServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deduction_bonus")
public class DeductionBonusController extends AbstractBaseController<DeductionBonus, DeductionBonusServiceImpl>
{
    public DeductionBonusController(DeductionBonusServiceImpl service) {
        super(service);
    }
}