package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.TimeSheet;
import com.automation.attendanceautomationmanagementsystem.service.TimeSheetService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/time_sheet")
public class TimeSheetController
{
    private final TimeSheetService timeSheetService;

    public TimeSheetController(TimeSheetService timeSheetService) {
        this.timeSheetService = timeSheetService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public TimeSheet save(@RequestBody TimeSheet timeSheet)
    {
        return timeSheetService.save(timeSheet);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public TimeSheet update(@RequestBody TimeSheet timeSheet)
    {
        return timeSheetService.save(timeSheet);
    }

    @DeleteMapping("/deleteTimeSheetById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        timeSheetService.deleteById(id);
    }

    @GetMapping("/findTimeSheetById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public TimeSheet findById(@PathVariable Long id)
    {
        return timeSheetService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeSheet> findAll()
    {
        return timeSheetService.findAll();
    }
}