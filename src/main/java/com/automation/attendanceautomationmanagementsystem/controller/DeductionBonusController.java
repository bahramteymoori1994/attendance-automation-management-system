package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.DeductionBonus;
import com.automation.attendanceautomationmanagementsystem.model.enums.DeductionType;
import com.automation.attendanceautomationmanagementsystem.service.impl.DeductionBonusServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deduction_bonus")
public class DeductionBonusController extends AbstractBaseController<DeductionBonus, DeductionBonusServiceImpl>
{
    private final DeductionBonusServiceImpl deductionBonusService;

    public DeductionBonusController(DeductionBonusServiceImpl service, DeductionBonusServiceImpl deductionBonusService) {
        super(service);
        this.deductionBonusService = deductionBonusService;
    }

    @GetMapping("/findDeductionBonusByDeductionType/{type}")
    public List<DeductionBonus> findDeductionBonusByDeductionType(@PathVariable DeductionType type)
    {
        return deductionBonusService.findDeductionBonusByDeductionType(type);
    }
}