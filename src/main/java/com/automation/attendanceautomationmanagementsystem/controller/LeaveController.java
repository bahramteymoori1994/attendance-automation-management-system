package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Leave;
import com.automation.attendanceautomationmanagementsystem.model.enums.LeaveType;
import com.automation.attendanceautomationmanagementsystem.service.impl.LeaveServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("leave")
public class LeaveController extends AbstractBaseController<Leave, LeaveServiceImpl>
{
    private final LeaveServiceImpl leaveServiceImpl;

    public LeaveController(LeaveServiceImpl service, LeaveServiceImpl leaveServiceImpl) {
        super(service);
        this.leaveServiceImpl = leaveServiceImpl;
    }

    @GetMapping("/findLeavesByYear/{year}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Leave> findLeavesByYear(@PathVariable Integer year)
    {
        return leaveServiceImpl.findLeavesByYear(year);
    }

    @GetMapping("/findLeavesByLeaveType/{leaveType}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Leave> findLeavesByLeaveType(@PathVariable LeaveType leaveType)
    {
        return leaveServiceImpl.findLeavesByLeaveType(leaveType);
    }

    @GetMapping("/findLeavesByStartDate/{date}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Leave> findLeavesByStartDate(@PathVariable LocalDate date)
    {
        return leaveServiceImpl.findLeavesByStartDate(date);
    }

    @GetMapping("/findLeavesByEndDate/{date}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Leave> findLeavesByEndDate(@PathVariable LocalDate date)
    {
        return leaveServiceImpl.findLeavesByEndDate(date);
    }

    @GetMapping("/findLeavesByDestination/{destination}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Leave> findLeavesByDestination(@PathVariable String destination)
    {
        return leaveServiceImpl.findLeavesByDestination(destination);
    }
}