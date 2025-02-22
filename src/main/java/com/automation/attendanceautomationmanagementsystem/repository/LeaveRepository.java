package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.Leave;
import com.automation.attendanceautomationmanagementsystem.model.enums.LeaveType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.attribute.standard.Destination;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long>
{
    List<Leave> findLeavesByYear(Integer year);
    List<Leave> findLeavesByLeaveType(LeaveType leaveType);
    List<Leave> findLeavesByStartDate(LocalDate date);
    List<Leave> findLeavesByEndDate(LocalDate date);
    List<Leave> findLeavesByDestination(String destination);
}