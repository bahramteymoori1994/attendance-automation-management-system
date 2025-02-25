package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.TimeSheet;
import com.automation.attendanceautomationmanagementsystem.model.enums.UserStatus;
import com.automation.attendanceautomationmanagementsystem.service.impl.TimeSheetServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/time_sheet")
public class TimeSheetController extends AbstractBaseController<TimeSheet, TimeSheetServiceImpl>
{
    private final TimeSheetServiceImpl timeSheetServiceImpl;

    public TimeSheetController(TimeSheetServiceImpl service, TimeSheetServiceImpl timeSheetServiceImpl) {
        super(service);
        this.timeSheetServiceImpl = timeSheetServiceImpl;
    }

    @GetMapping("/findTimeSheetByTimeSheetTitle/{timeSheetTitle}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeSheet> findTimeSheetByTimeSheetTitle(@PathVariable String timeSheetTitle)
    {
        return timeSheetServiceImpl.findTimeSheetByTimeSheetTitle(timeSheetTitle);
    }

    @GetMapping("/findTimeSheetsByDayWeek/{dayWeek}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeSheet> findTimeSheetsByDayWeek(@PathVariable DayOfWeek dayWeek)
    {
        return timeSheetServiceImpl.findTimeSheetsByDayWeek(dayWeek);
    }

    @GetMapping("/findTimeSheetsByTimeSheetDate/{timeSheetDate}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeSheet> findTimeSheetsByTimeSheetDate(@PathVariable LocalTime timeSheetDate)
    {
        return timeSheetServiceImpl.findTimeSheetsByTimeSheetDate(timeSheetDate);
    }

    @GetMapping("/findTimeSheetsByUserStatus/{userStatus}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeSheet> findTimeSheetsByUserStatus(@PathVariable UserStatus userStatus)
    {
        return timeSheetServiceImpl.findTimeSheetsByUserStatus(userStatus);
    }

    @GetMapping("/findTimeSheetsByEntryTime/{entryTime}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeSheet> findTimeSheetsByEntryTime(@PathVariable LocalTime entryTime)
    {
        return timeSheetServiceImpl.findTimeSheetsByEntryTime(entryTime);
    }

    @GetMapping("/findTimeSheetsByStartTime/{startTime}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeSheet> findTimeSheetsByStartTime(@PathVariable LocalTime startTime)
    {
        return timeSheetServiceImpl.findTimeSheetsByStartTime(startTime);
    }

    @GetMapping("/findTimeSheetsByExitTime/{endTime}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<TimeSheet> findTimeSheetsByExitTime(@PathVariable LocalTime endTime)
    {
        return timeSheetServiceImpl.findTimeSheetsByExitTime(endTime);
    }
}