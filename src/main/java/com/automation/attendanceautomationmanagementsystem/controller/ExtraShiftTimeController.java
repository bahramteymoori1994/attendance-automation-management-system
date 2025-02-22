package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.ExtraShiftTime;
import com.automation.attendanceautomationmanagementsystem.model.enums.ExtraShiftType;
import com.automation.attendanceautomationmanagementsystem.service.impl.ExtraShiftTimeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/extra_shift_time")
public class ExtraShiftTimeController extends AbstractBaseController<ExtraShiftTime, ExtraShiftTimeServiceImpl>
{
    private final ExtraShiftTimeServiceImpl extraShiftTimeService;

    public ExtraShiftTimeController(ExtraShiftTimeServiceImpl service, ExtraShiftTimeServiceImpl extraShiftTimeService) {
        super(service);
        this.extraShiftTimeService = extraShiftTimeService;
    }

    @GetMapping("/findExtraShiftTimesByExtraShiftDate/{extraShiftDate}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftDate(@PathVariable LocalDate extraShiftDate)
    {
        return extraShiftTimeService.findExtraShiftTimesByExtraShiftDate(extraShiftDate);
    }

    @GetMapping("/findExtraShiftTimesByDayWeek/{dayWeek}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ExtraShiftTime> findExtraShiftTimesByDayWeek(@PathVariable DayOfWeek dayWeek)
    {
        return extraShiftTimeService.findExtraShiftTimesByDayWeek(dayWeek);
    }

    @GetMapping("/findExtraShiftTimesByExtraShiftType/{extraShiftType}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftType(@PathVariable ExtraShiftType extraShiftType)
    {
        return extraShiftTimeService.findExtraShiftTimesByExtraShiftType(extraShiftType);
    }

    @GetMapping("/findExtraShiftTimesByExtraShiftStart/{extraShiftStart}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftStart(@PathVariable LocalTime extraShiftStart)
    {
        return extraShiftTimeService.findExtraShiftTimesByExtraShiftStart(extraShiftStart);
    }

    @GetMapping("/findExtraShiftTimesByExtraShiftEnd/{extraShiftEnd}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftEnd(@PathVariable LocalTime extraShiftEnd)
    {
        return extraShiftTimeService.findExtraShiftTimesByExtraShiftEnd(extraShiftEnd);
    }

    @GetMapping("/findExtraShiftTimesByExtraShiftTask/{extraShiftTask}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ExtraShiftTime> findExtraShiftTimesByExtraShiftTask(@PathVariable String extraShiftTask)
    {
        return extraShiftTimeService.findExtraShiftTimesByExtraShiftTask(extraShiftTask);
    }
}