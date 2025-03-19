package com.automation.attendanceautomationmanagementsystem.repository;
 import com.automation.attendanceautomationmanagementsystem.model.DrivingLicense;
 import com.automation.attendanceautomationmanagementsystem.model.Person;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DrivingLicenseRepository extends JpaRepository<DrivingLicense, Long> {

    DrivingLicense findDrivingLicenseBySerialNumber(String serialNumber);
    List<DrivingLicense> findDrivingLicensesByValidityPeriod(LocalDate validityPeriod);
    List<DrivingLicense> findDrivingLicenseByCreationDate(LocalDate creationDate);
    boolean existsDrivingLicenseByLevelLicense(Boolean levelLicense);
    DrivingLicense findDrivingLicenseByPerson(Person person);
}
