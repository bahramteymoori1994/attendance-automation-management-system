package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    List<Organization> findOrganizationByName(String name);
    List<Organization> findOrganizationByAddress(String address);
    Organization findOrganizationByPhoneNumber(String phoneNumber);
    List<Organization> findOrganizationByDescription(String description);
    List<Organization> findOrganizationByTask(String task);
}
