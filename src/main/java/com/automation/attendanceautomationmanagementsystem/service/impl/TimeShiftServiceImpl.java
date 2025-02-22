package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.TimeShift;
import com.automation.attendanceautomationmanagementsystem.repository.TimeShiftRepository;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class TimeShiftServiceImpl extends AbstractBaseServiceImpl<TimeShift, TimeShiftRepository>
{
    private final TimeShiftRepository timeShiftRepository;

    public TimeShiftServiceImpl(TimeShiftRepository repository, TimeShiftRepository timeShiftRepository) {
        super(repository);
        this.timeShiftRepository = timeShiftRepository;
    }

    public List<TimeShift> findTimeShiftsByShiftDate(LocalDate date)
    {
        return timeShiftRepository.findTimeShiftsByShiftDate(date);
    }

    public List<TimeShift> findTimeShiftsByDayWeek(DayOfWeek dayWeek)
    {
        return timeShiftRepository.findTimeShiftsByDayWeek(dayWeek);
    }

    public List<TimeShift> findTimeShiftsByShiftStart(LocalTime startTime)
    {
        return timeShiftRepository.findTimeShiftsByShiftStart(startTime);
    }

    public List<TimeShift> findTimeShiftsByShiftEnd(LocalTime endTime)
    {
        return timeShiftRepository.findTimeShiftsByShiftEnd(endTime);
    }
}