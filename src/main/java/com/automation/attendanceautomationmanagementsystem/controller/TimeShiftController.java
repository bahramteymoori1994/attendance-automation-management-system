package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.TimeShift;
import com.automation.attendanceautomationmanagementsystem.service.impl.TimeShiftServiceImpl;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/time_shift")
public class TimeShiftController extends AbstractBaseController<TimeShift, TimeShiftServiceImpl>
{
    private final TimeShiftServiceImpl timeShiftService;

    public TimeShiftController(TimeShiftServiceImpl service, TimeShiftServiceImpl timeShiftService) {
        super(service);
        this.timeShiftService = timeShiftService;
    }

    @GetMapping("/findTimeShiftsByShiftDate/{date}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeShift> findTimeShiftsByShiftDate(@PathVariable LocalDate date)
    {
        return timeShiftService.findTimeShiftsByShiftDate(date);
    }

    @GetMapping("/findTimeShiftsByDayWeek/{dayWeek}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeShift> findTimeShiftsByDayWeek(@PathVariable DayOfWeek dayWeek)
    {
        return timeShiftService.findTimeShiftsByDayWeek(dayWeek);
    }

    @GetMapping("/findTimeShiftsByShiftStart/{startTime}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeShift> findTimeShiftsByShiftStart(@PathVariable LocalTime startTime)
    {
        return timeShiftService.findTimeShiftsByShiftStart(startTime);
    }

    @GetMapping("/findTimeShiftsByShiftEnd/{endTime}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeShift> findTimeShiftsByShiftEnd(@PathVariable LocalTime endTime)
    {
        return timeShiftService.findTimeShiftsByShiftEnd(endTime);
    }
}