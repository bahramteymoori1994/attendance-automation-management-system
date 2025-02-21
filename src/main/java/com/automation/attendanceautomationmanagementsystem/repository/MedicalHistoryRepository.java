package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
}
