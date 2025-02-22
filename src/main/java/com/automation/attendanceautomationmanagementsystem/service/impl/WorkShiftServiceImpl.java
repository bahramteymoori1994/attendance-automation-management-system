package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import com.automation.attendanceautomationmanagementsystem.model.enums.WorkShiftType;
import com.automation.attendanceautomationmanagementsystem.repository.WorkShiftRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkShiftServiceImpl extends AbstractBaseServiceImpl<WorkShift, WorkShiftRepository>
{

    private final WorkShiftRepository workShiftRepository;

    public WorkShiftServiceImpl(WorkShiftRepository repository, WorkShiftRepository workShiftRepository) {
        super(repository);
        this.workShiftRepository = workShiftRepository;
    }

    public WorkShift findWorkShiftByWorkShiftCode(String workShiftCode)
    {
        return workShiftRepository.findWorkShiftByWorkShiftCode(workShiftCode);
    }

    public List<WorkShift> findWorkShiftByName(String workShiftName)
    {
        return workShiftRepository.findWorkShiftByName(workShiftName);
    }

    public List<WorkShift> findWorkShiftByWorkShiftType(WorkShiftType workShiftType)
    {
        return workShiftRepository.findWorkShiftByWorkShiftType(workShiftType);
    }
}