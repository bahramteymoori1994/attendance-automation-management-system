package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.Department;
import com.automation.attendanceautomationmanagementsystem.model.Section;
import com.automation.attendanceautomationmanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
    List<Section> findByName(String name);
    List<Section> findByAddress(String address);
    Section findByPhoneNumber(String phoneNumber);
    Section findByInternalCode(String internalCode);
    Section findBySectionNumber(String sectionNumber);
    boolean existsByAccessLevel(boolean accessLevel);
    Section findSectionByDepartment(Department department);
    List<Section> findSectionByUserSet(Set<User> userSet);
}
