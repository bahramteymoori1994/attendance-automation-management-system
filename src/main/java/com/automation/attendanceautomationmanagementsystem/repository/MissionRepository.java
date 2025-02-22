package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.Mission;
import com.automation.attendanceautomationmanagementsystem.model.enums.MissionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long>
{
    List<Mission> findMissionsByMissionType(MissionType missionType);
    List<Mission> findMissionsByMissionTitle(String missionTitle);
    List<Mission> findMissionsByStartDate(LocalDate date);
    List<Mission> findMissionsByEndDate(LocalDate date);
    List<Mission> findMissionsByMissionPlace(String missionPlace);
    List<Mission> findMissionsByMissionTask(String task);
}