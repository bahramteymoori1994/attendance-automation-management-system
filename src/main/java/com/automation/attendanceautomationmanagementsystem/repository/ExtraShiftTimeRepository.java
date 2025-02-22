package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.ExtraShiftTime;
import com.automation.attendanceautomationmanagementsystem.model.enums.ExtraShiftType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface ExtraShiftTimeRepository extends JpaRepository<ExtraShiftTime, Long>
{
    List<ExtraShiftTime> findExtraShiftTimesByExtraShiftDate(LocalDate extraShiftDate);
    List<ExtraShiftTime> findExtraShiftTimesByDayWeek(DayOfWeek dayWeek);
    List<ExtraShiftTime> findExtraShiftTimesByExtraShiftType(ExtraShiftType extraShiftType);
    List<ExtraShiftTime> findExtraShiftTimesByExtraShiftStart(LocalTime extraShiftStart);
    List<ExtraShiftTime> findExtraShiftTimesByExtraShiftEnd(LocalTime extraShiftEnd);
    List<ExtraShiftTime> findExtraShiftTimesByExtraShiftTask(String extraShiftTask);
}