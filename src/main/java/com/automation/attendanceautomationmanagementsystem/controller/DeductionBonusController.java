package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.service.DeductionBonusService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deduction_bonus")
public class DeductionBonusController
{
    private final DeductionBonusService deductionBonusService;

    public DeductionBonusController(DeductionBonusService deductionBonusService) {
        this.deductionBonusService = deductionBonusService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public DeductionBonus save(@RequestBody DeductionBonus deductionBonus)
    {
        return deductionBonusService.save(deductionBonus);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public DeductionBonus update(@RequestBody DeductionBonus deductionBonus)
    {
        return deductionBonusService.save(deductionBonus);
    }

    @DeleteMapping("/deleteDeductionBonusById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        deductionBonusService.deleteById(id);
    }

    @GetMapping("/findDeductionBonusById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public DeductionBonus findById(@PathVariable Long id)
    {
        return deductionBonusService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<DeductionBonus> findAllDeductionBonus()
    {
        return deductionBonusService.findAll();
    }
}