package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Mission;
import com.automation.attendanceautomationmanagementsystem.repository.MissionRepository;
import com.automation.attendanceautomationmanagementsystem.service.MissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionServiceImpl implements MissionService
{
    private final MissionRepository missionRepository;

    public MissionServiceImpl(MissionRepository missionRepository) {
        this.missionRepository = missionRepository;
    }

    @Override
    public Mission save(Mission mission) {
        return missionRepository.save(mission);
    }

    @Override
    public Mission update(Mission mission) {
        return missionRepository.save(mission);
    }

    @Override
    public void deleteById(Long id) {
        missionRepository.deleteById(id);
    }

    @Override
    public Mission findById(Long id) {
        return missionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Mission> findAll() {
        return missionRepository.findAll();
    }
}