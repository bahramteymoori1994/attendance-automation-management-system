package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import com.automation.attendanceautomationmanagementsystem.model.enums.WorkShiftType;
import com.automation.attendanceautomationmanagementsystem.service.impl.WorkShiftServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work_shift")
public class WorkShiftController extends AbstractBaseController<WorkShift, WorkShiftServiceImpl>
{
    private WorkShiftServiceImpl workShiftService;

    public WorkShiftController(WorkShiftServiceImpl service, WorkShiftServiceImpl workShiftService) {
        super(service);
        this.workShiftService = workShiftService;
    }

    @GetMapping("/findWorkShiftByWorkShiftCode/{workShiftCode}")
    @ResponseStatus(value = HttpStatus.OK)
    public WorkShift findWorkShiftByWorkShiftCode(@PathVariable String workShiftCode)
    {
        return workShiftService.findWorkShiftByWorkShiftCode(workShiftCode);
    }

    @GetMapping("/findWorkShiftByName/{workShiftName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<WorkShift> findWorkShiftByName(@PathVariable String workShiftName)
    {
        return workShiftService.findWorkShiftByName(workShiftName);
    }

    @GetMapping("/findWorkShiftByWorkShiftType/{workShiftType}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<WorkShift> findWorkShiftByWorkShiftType(@PathVariable WorkShiftType workShiftType)
    {
        return workShiftService.findWorkShiftByWorkShiftType(workShiftType);
    }
}