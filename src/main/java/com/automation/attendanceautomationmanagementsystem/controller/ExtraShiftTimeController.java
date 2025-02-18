package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.ExtraShiftTime;
import com.automation.attendanceautomationmanagementsystem.service.ExtraShiftTimeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/extra_shift_time")
public class ExtraShiftTimeController
{
    private final ExtraShiftTimeService extraShiftTimeService;

    public ExtraShiftTimeController(ExtraShiftTimeService extraShiftTimeService) {
        this.extraShiftTimeService = extraShiftTimeService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public ExtraShiftTime save(@RequestBody ExtraShiftTime extraShiftTime)
    {
        return extraShiftTimeService.save(extraShiftTime);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public ExtraShiftTime update(@RequestBody ExtraShiftTime extraShiftTime)
    {
        return extraShiftTimeService.save(extraShiftTime);
    }

    @DeleteMapping("/deleteExtraShiftTimeById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        extraShiftTimeService.deleteById(id);
    }

    @GetMapping("/findExtraShiftTimeById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public ExtraShiftTime findById(@PathVariable Long id)
    {
        return extraShiftTimeService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<ExtraShiftTime> findAll()
    {
        return extraShiftTimeService.findAll();
    }
}