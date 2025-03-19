package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(String Name);
    List<Person> findByFamily(String family);
    Person findByNationalCode(String nationalCode);
    List<Person> findByBirthdate(LocalDate birthdate);
    Person findByPhone(String phone);
    Person findByEmail(String email);
    List<Person> findByAddress(String address);
    List<Person> findByPostCode(String postCode);
}
