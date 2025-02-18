package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Leave;
import com.automation.attendanceautomationmanagementsystem.repository.LeaveRepository;
import com.automation.attendanceautomationmanagementsystem.service.LeaveService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService
{
    private final LeaveRepository leaveRepository;

    public LeaveServiceImpl(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }

    @Override
    public Leave save(Leave leave) {
        return leaveRepository.save(leave);
    }

    @Override
    public Leave update(Leave leave) {
        return leaveRepository.save(leave);
    }

    @Override
    public void deleteById(Long id) {
        leaveRepository.deleteById(id);
    }

    @Override
    public Leave findById(Long id) {
        return leaveRepository.findById(id).orElse(null);
    }

    @Override
    public List<Leave> findAll() {
        return leaveRepository.findAll();
    }
}