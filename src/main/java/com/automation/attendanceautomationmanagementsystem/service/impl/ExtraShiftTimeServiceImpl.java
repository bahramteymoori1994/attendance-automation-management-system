package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.ExtraShiftTime;
import com.automation.attendanceautomationmanagementsystem.model.enums.ExtraShiftType;
import com.automation.attendanceautomationmanagementsystem.repository.ExtraShiftTimeRepository;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class ExtraShiftTimeServiceImpl extends AbstractBaseServiceImpl<ExtraShiftTime, ExtraShiftTimeRepository>
{
    private final ExtraShiftTimeRepository extraShiftTimeRepository;

    public ExtraShiftTimeServiceImpl(ExtraShiftTimeRepository repository, ExtraShiftTimeRepository extraShiftTimeRepository) {
        super(repository);
        this.extraShiftTimeRepository = extraShiftTimeRepository;
    }

    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftDate(LocalDate extraShiftDate)
    {
        return extraShiftTimeRepository.findExtraShiftTimesByExtraShiftDate(extraShiftDate);
    }

    public List<ExtraShiftTime> findExtraShiftTimesByDayWeek(DayOfWeek dayWeek)
    {
        return extraShiftTimeRepository.findExtraShiftTimesByDayWeek(dayWeek);
    }

    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftType(ExtraShiftType extraShiftType)
    {
        return extraShiftTimeRepository.findExtraShiftTimesByExtraShiftType(extraShiftType);
    }

    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftStart(LocalTime extraShiftStart)
    {
        return extraShiftTimeRepository.findExtraShiftTimesByExtraShiftStart(extraShiftStart);
    }

    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftEnd(LocalTime extraShiftEnd)
    {
        return extraShiftTimeRepository.findExtraShiftTimesByExtraShiftEnd(extraShiftEnd);
    }

    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftTask(String extraShiftTask)
    {
        return extraShiftTimeRepository.findExtraShiftTimesByExtraShiftTask(extraShiftTask);
    }
}