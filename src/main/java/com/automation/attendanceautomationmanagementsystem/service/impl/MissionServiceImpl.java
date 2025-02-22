package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Mission;
import com.automation.attendanceautomationmanagementsystem.model.enums.MissionType;
import com.automation.attendanceautomationmanagementsystem.repository.MissionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MissionServiceImpl extends AbstractBaseServiceImpl<Mission, MissionRepository>
{
    private final MissionRepository missionRepository;

    public MissionServiceImpl(MissionRepository repository, MissionRepository missionRepository) {
        super(repository);
        this.missionRepository = missionRepository;
    }

    public List<Mission> findMissionsByMissionType(MissionType missionType)
    {
        return missionRepository.findMissionsByMissionType(missionType);
    }

    public List<Mission> findMissionsByMissionTitle(String missionTitle)
    {
        return missionRepository.findMissionsByMissionTitle(missionTitle);
    }

    public List<Mission> findMissionsByStartDate(LocalDate date)
    {
        return missionRepository.findMissionsByStartDate(date);
    }

    public List<Mission> findMissionsByEndDate(LocalDate date)
    {
        return missionRepository.findMissionsByEndDate(date);
    }

    public List<Mission> findMissionsByMissionPlace(String missionPlace)
    {
        return missionRepository.findMissionsByMissionPlace(missionPlace);
    }

    public List<Mission> findMissionsByMissionTask(String task)
    {
        return missionRepository.findMissionsByMissionTask(task);
    }
}