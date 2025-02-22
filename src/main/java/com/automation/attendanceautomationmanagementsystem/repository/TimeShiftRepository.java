package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.TimeShift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface TimeShiftRepository extends JpaRepository<TimeShift, Long>
{
    List<TimeShift> findTimeShiftsByShiftDate(LocalDate date);
    List<TimeShift> findTimeShiftsByDayWeek(DayOfWeek dayWeek);
    List<TimeShift> findTimeShiftsByShiftStart(LocalTime startTime);
    List<TimeShift> findTimeShiftsByShiftEnd(LocalTime endTime);
}