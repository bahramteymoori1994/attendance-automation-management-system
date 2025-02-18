package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.controller.DeductionBonus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeductionBonusRepository extends JpaRepository<DeductionBonus, Long> {
}
