package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.MedicalHistory;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
    List<MedicalHistory> findByIllness(String illness);
    List<MedicalHistory> findByPreviousIllness(String previousIllness);
    MedicalHistory findMedicalHistoriesByPerson(Person person);
}
