package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.model.WorkHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface WorkHistoryRepository extends JpaRepository<WorkHistory, Long> {
    List<WorkHistory> findByJobTitle(String jobTitle);
    WorkHistory findByOrganizationName(String organizationName);
    List<WorkHistory> findByStartDate(LocalDate startDate);
    List<WorkHistory> findByEndDate(LocalDate endDate);
    List<WorkHistory> findByResponsibility(String responsibility);
    List<WorkHistory> findByJobPromotion(String jobPromotion);
    boolean existsByCollaborationType(boolean collaborationType);
    WorkHistory findWorkHistoriesByPerson(Person person);
}
