package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Leave;
import com.automation.attendanceautomationmanagementsystem.model.enums.LeaveType;
import com.automation.attendanceautomationmanagementsystem.repository.LeaveRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LeaveServiceImpl extends AbstractBaseServiceImpl<Leave, LeaveRepository>
{
    private final LeaveRepository leaveRepository;

    public LeaveServiceImpl(LeaveRepository repository, LeaveRepository leaveRepository) {
        super(repository);
        this.leaveRepository = leaveRepository;
    }

    public List<Leave> findLeavesByYear(Integer year)
    {
        return leaveRepository.findLeavesByYear(year);
    }

    public List<Leave> findLeavesByLeaveType(LeaveType leaveType)
    {
        return leaveRepository.findLeavesByLeaveType(leaveType);
    }

    public List<Leave> findLeavesByStartDate(LocalDate date)
    {
        return leaveRepository.findLeavesByStartDate(date);
    }

    public List<Leave> findLeavesByEndDate(LocalDate date)
    {
        return leaveRepository.findLeavesByEndDate(date);
    }

    public List<Leave> findLeavesByDestination(String destination)
    {
        return leaveRepository.findLeavesByDestination(destination);
    }
}