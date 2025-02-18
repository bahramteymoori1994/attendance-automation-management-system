package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.TimeShift;
import com.automation.attendanceautomationmanagementsystem.service.TimeShiftService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/time_shift")
public class TimeShiftController
{
    private final TimeShiftService timeShiftService;

    public TimeShiftController(TimeShiftService timeShiftService) {
        this.timeShiftService = timeShiftService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public TimeShift save(@RequestBody TimeShift timeShift)
    {
        return timeShiftService.save(timeShift);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public TimeShift update(@RequestBody TimeShift timeShift)
    {
        return timeShiftService.save(timeShift);
    }

    @DeleteMapping("/deleteTimeShiftById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        timeShiftService.deleteById(id);
    }

    @GetMapping("/findTimeShiftById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public TimeShift findById(@PathVariable Long id)
    {
        return timeShiftService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeShift> findAll()
    {
        return timeShiftService.findAll();
    }
}