package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.TimeSheet;
import com.automation.attendanceautomationmanagementsystem.model.enums.UserStatus;
import com.automation.attendanceautomationmanagementsystem.repository.TimeSheetRepository;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

@Service
public class TimeSheetServiceImpl extends AbstractBaseServiceImpl<TimeSheet, TimeSheetRepository>{

    private final TimeSheetRepository timeSheetRepository;

    public TimeSheetServiceImpl(TimeSheetRepository repository, TimeSheetRepository timeSheetRepository) {
        super(repository);
        this.timeSheetRepository = timeSheetRepository;
    }

    public List<TimeSheet> findTimeSheetByTimeSheetTitle(String timeSheetTitle)
    {
        return timeSheetRepository.findTimeSheetByTimeSheetTitle(timeSheetTitle);
    }

    public List<TimeSheet> findTimeSheetsByDayWeek(DayOfWeek dayWeek)
    {
        return timeSheetRepository.findTimeSheetsByDayWeek(dayWeek);
    }

    public List<TimeSheet> findTimeSheetsByTimeSheetDate(LocalTime timeSheetDate)
    {
        return timeSheetRepository.findTimeSheetsByTimeSheetDate(timeSheetDate);
    }

    public List<TimeSheet> findTimeSheetsByUserStatus(UserStatus userStatus)
    {
        return timeSheetRepository.findTimeSheetsByUserStatus(userStatus);
    }

    public List<TimeSheet> findTimeSheetsByEntryTime(LocalTime entryTime)
    {
        return timeSheetRepository.findTimeSheetsByEntryTime(entryTime);
    }

    public List<TimeSheet> findTimeSheetsByStartTime(LocalTime startTime)
    {
        return timeSheetRepository.findTimeSheetsByStartTime(startTime);
    }

    public List<TimeSheet> findTimeSheetsByExitTime(LocalTime endTime)
    {
        return timeSheetRepository.findTimeSheetsByExitTime(endTime);
    }
}