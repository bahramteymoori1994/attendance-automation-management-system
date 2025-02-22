package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.DeductionBonus;
import com.automation.attendanceautomationmanagementsystem.model.enums.DeductionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeductionBonusRepository extends JpaRepository<DeductionBonus, Long>
{
    List<DeductionBonus> findDeductionBonusByDeductionType(DeductionType type);
}