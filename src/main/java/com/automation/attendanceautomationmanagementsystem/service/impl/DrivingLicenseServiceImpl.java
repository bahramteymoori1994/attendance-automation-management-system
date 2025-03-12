package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.DrivingLicense;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.repository.DrivingLicenseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DrivingLicenseServiceImpl extends AbstractBaseServiceImpl<DrivingLicense, DrivingLicenseRepository>{

    private final DrivingLicenseRepository drivingLicenseRepository;

    public DrivingLicenseServiceImpl(DrivingLicenseRepository repository, DrivingLicenseRepository drivingLicenseRepository) {
        super(repository);
        this.drivingLicenseRepository = drivingLicenseRepository;
    }

    public DrivingLicense findDrivingLicenseBySerialNumber(String serialNumber){
        return drivingLicenseRepository.findDrivingLicenseBySerialNumber(serialNumber);
    }
    public List<DrivingLicense> findDrivingLicensesByValidityPeriod(LocalDate validityPeriod){
        return drivingLicenseRepository.findDrivingLicensesByValidityPeriod(validityPeriod);
    }
    public List<DrivingLicense> findDrivingLicenseByCreationDate(LocalDate creationDate){
        return drivingLicenseRepository.findDrivingLicenseByCreationDate(creationDate);
    }
    public boolean existsDrivingLicenseByLevelLicense(Boolean levelLicense){
        return drivingLicenseRepository.existsDrivingLicenseByLevelLicense(levelLicense);
    }
    public DrivingLicense findDrivingLicenseByPerson(Person person){
        return drivingLicenseRepository.findDrivingLicenseByPerson(person);
    }
}
