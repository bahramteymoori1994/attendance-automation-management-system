package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.TimeSheet;
import com.automation.attendanceautomationmanagementsystem.model.enums.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface TimeSheetRepository extends JpaRepository<TimeSheet, Long>
{
    List<TimeSheet> findTimeSheetByTimeSheetTitle(String timeSheetTitle);
    List<TimeSheet> findTimeSheetsByDayWeek(DayOfWeek dayWeek);
    List<TimeSheet> findTimeSheetsByTimeSheetDate(LocalTime timeSheetDate);
    List<TimeSheet> findTimeSheetsByUserStatus(UserStatus userStatus);
    List<TimeSheet> findTimeSheetsByEntryTime(LocalTime entryTime);
    List<TimeSheet> findTimeSheetsByStartTime(LocalTime startTime);
    List<TimeSheet> findTimeSheetsByExitTime(LocalTime endTime);
}