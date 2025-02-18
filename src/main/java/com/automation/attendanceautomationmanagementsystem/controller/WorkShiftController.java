package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import com.automation.attendanceautomationmanagementsystem.service.WorkShiftService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work_shift")
public class WorkShiftController
{
    private final WorkShiftService workShiftService;

    public WorkShiftController(WorkShiftService workShiftService) {
        this.workShiftService = workShiftService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public WorkShift save(@RequestBody WorkShift workShift)
    {
        return workShiftService.save(workShift);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public WorkShift update(@RequestBody WorkShift workShift)
    {
        return workShiftService.update(workShift);
    }

    @DeleteMapping("/deleteWorkShiftById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        workShiftService.deleteById(id);
    }

    @GetMapping("/findWorkShiftById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public WorkShift findById(@PathVariable Long id)
    {
        return workShiftService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<WorkShift> findAll()
    {
        return workShiftService.findAll();
    }
}